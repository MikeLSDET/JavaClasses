package class20;

public class Teacher {

    /*
    Write a Java program called Teacher.  Identify features and behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have it their own features
    and behaviour. Test all 4 classes
     */

    String name;
    String subjectTeacher;
    double salary;
    boolean isFullTime;
    String gradeTeacher;
    static String school="Hot Dog Highschool";


    void teach(){
        System.out.println("teacher is starting to teach"+subjectTeacher);

    }

    void handOutHw(){
        System.out.println("teacher is handing out hw in the subject of"+subjectTeacher);
    }



}
