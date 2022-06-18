public class main {
    public static void main(String[] args) {
       UserExam userexam,userexam1;
       try{
           userexam=UserExam.getBuilder().setName("Karthik").setMaths(89).setEnglish(98).build();
           System.out.println(userexam.getName());
           System.out.println(userexam.getMaths());
           System.out.println(userexam.getEnglish());
           userexam1=UserExam.getBuilder().build();
           System.out.println(userexam1.getName());
           System.out.println(userexam1.getMaths());
           System.out.println(userexam1.getEnglish());

       }
       catch(Exception e)
       {
           System.out.println("Some exceptions occurred");
       }

    }
}
