public class Main{
    public static void main(String[] args){

        ChildClass1 c1 = new ChildClass1("Paper1",15,44);
        ChildClass2 c2 = new ChildClass2("Paper2",11,42);

        System.out.println("ChildClass1" +c1);
        c1.showDetails();

        System.out.println("ChildClass2" +c2);
        c2.showDetails();

        TypeChecker check = new TypeChecker();
        System.out.println("TypeChecker" +check);
        check.identifyObjectType(c1);
        check.identifyObjectType(c2);
    }
}