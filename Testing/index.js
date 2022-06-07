const fs = require('fs');
const { resolve } = require('path');
const { get } = require('superagent');
const superagent = require('superagent');

/* const readFilePro=function(data)
{
 
}
*/
const readFilePro = file => {
  return new Promise((resolve, reject) => {
    fs.readFile(file, (err, res) => {
      if (err) reject('Read not successful');
      resolve(res);
    });
  });
};

const writeFilePro = (location, data) => {
  return new Promise((resolve, reject) => {
    fs.writeFile(location, data, err => {
      if (err) reject('Write not succesful');

      resolve('Write Successful');
    });
  });
};

const getDogPic = async () => {
  try {
    const data = await readFilePro(`${__dirname}/dog.txt`);

    const res1 = superagent.get(
      `https://dog.ceo/api/breed/${data}/images/random`
    );
    const res2 = superagent.get(
      `https://dog.ceo/api/breed/${data}/images/random`
    );
    const res3 = superagent.get(
      `https://dog.ceo/api/breed/${data}/images/random`
    );
    const res = await Promise.all([res1, res2, res3]);
    const img = res.map(el => el.body.message);
    await writeFilePro(`output.txt`, img.join('\n'));
  } catch (err) {
    console.log(err);
  }
  return 'Ready';
};

(async () => {
  console.log('Finish1');
  const mes = await getDogPic();
  console.log(mes);
  console.log('Finish2');
})();
