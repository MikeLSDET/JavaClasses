package ReviewClass07;

public class Tester {

    public static void main(String[] args) {
        InstanceVariable instanceVariable=new InstanceVariable();
        instanceVariable.name="instance";
        instanceVariable.course="java";

        InstanceVariable instanceVariable2=new InstanceVariable();
        instanceVariable2.name="anotherinstance";
        instanceVariable2.course="selenium";
        System.out.println(instanceVariable2.course);

    }
}
