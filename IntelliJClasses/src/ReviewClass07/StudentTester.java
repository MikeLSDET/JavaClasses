package ReviewClass07;

public class StudentTester {
    public static void main(String[] args) {
        Student s1 =new Student();
        s1.name="Sharif";
        s1.course="Java";
        s1.displayTheFees();


        Student s2=new Student();
        s2.name=" Andrei";
        s2.course="Selenium";
        s2.displayTheFees();
        s2.session();

        Student s3=new Student();
        s3.name=" Enes";
        s3.course="API";
        s3.displayTheFees();



    }
}
