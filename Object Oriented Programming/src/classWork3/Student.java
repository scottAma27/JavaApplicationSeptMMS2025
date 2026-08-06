package classWork3;

class Student extends Person {

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " is always studying and attending classes.");
    }
    
  //   or @Override
  //  void displayDetails(){
      //  System.out.println("Student Name"+ name);
       // System.out.println("Student Age"+ age);
    //}
}
