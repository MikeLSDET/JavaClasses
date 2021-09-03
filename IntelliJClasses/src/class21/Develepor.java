package class21;

public class Develepor extends Employee{
    String programmingLangauge;
    void code(){
        System.out.println("Developer having id"+empId+ "age" +age+ "can program in "+programmingLangauge);
    }

    public static void main(String[] args) {
        Develepor develepor=new Develepor();
        develepor.empId="123";
        develepor.age=50;
        develepor.programmingLangauge="Java";
        develepor.code();
        develepor.work();
        develepor.sleep();
    }
}
