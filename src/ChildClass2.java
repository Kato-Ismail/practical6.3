public class ChildClass2 extends ParentClass {
    int Id;

    public ChildClass2(String name,int age,int id){
        super(name,age);
        this.Id = id;
    }

    public void showDetails(){
        super.showDetails();
        System.out.println("Id:"+Id);
    }
}
