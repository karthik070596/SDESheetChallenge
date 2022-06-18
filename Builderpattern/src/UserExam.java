import java.security.InvalidParameterException;

public class UserExam {
    private String name;
    private int maths;
    private int english;
    private UserExam(){}
    public static UserExamBuilder getBuilder()
    {
        return new UserExamBuilder();
    }
    public String getName(){
        return this.name;
    }
    public int getMaths()
    {
        return this.maths;
    }
    public int getEnglish()
    {
        return this.english;
    }
    public static class UserExamBuilder{
        private String name="Default";
        private int maths=40;
        private int english=60;

        public UserExamBuilder setName(String name)
        {
            this.name=name;
            return this;
        }
        public UserExamBuilder setMaths(int maths)
        {
            this.maths=maths;
            return this;
        }
        public UserExamBuilder setEnglish(int english)
        {
            this.english=english;
            return this;
        }
        public UserExam build()
        {
            if((this.english<0 && this.english>100) && (this.maths<0 && this.maths>100))
                throw new InvalidParameterException("The marks should be between 0 to 100");
            if(this.name.startsWith("0"))
                throw new InvalidParameterException("The name cannot start with 0");
            UserExam userexam=new UserExam();
            userexam.maths=this.maths;
            userexam.english=this.english;
            userexam.name=this.name;
            return userexam;
        }


    }
}
