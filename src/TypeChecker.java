public class TypeChecker {
    public void identifyObjectType(ParentClass obj){
        if(obj instanceof ChildClass1){
            System.out.println("Child class object is an instance of ChildClass1");
        }else if(obj instanceof ChildClass2){
            System.out.println("Child class object is an instance of ChildClass2");
        }else{
            System.out.println("Unknown type");
        }
    }
}
