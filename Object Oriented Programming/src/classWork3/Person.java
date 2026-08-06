package classWork3;

    // or public abstract class Person {
    abstract class Person {
    
    protected String name;
    protected int age;

    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

   
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

   
    public abstract void performDuty();
    // or abstract void performDuty();
}
