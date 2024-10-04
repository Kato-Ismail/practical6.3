public class ParentClass {
    String name;
    int age;

    public ParentClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void showDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        }

        public final void displayMessage(){
        System.out.println("final message from ParentClass");
        }
}
