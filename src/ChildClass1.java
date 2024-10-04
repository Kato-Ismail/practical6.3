public class ChildClass1 extends ParentClass {
    int Id;

    public ChildClass1(String name,int age,int Id){
        super(name,age);
        this.Id = Id;
    }

    public void showDetails(){
        super.showDetails();
        System.out.println("Id:"+Id);
    }

}
