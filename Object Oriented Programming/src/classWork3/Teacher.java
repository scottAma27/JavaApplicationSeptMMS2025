package classWork3;

class Teacher extends Person{

    public Teacher(String name, int age){
        super(name, age);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " is teaching and also grading papers.");
    }
    
    //   or @Override
  //  void displayDetails(){
      //  System.out.println("Teacher Name"+ name);
       // System.out.println("Teacher Age"+ age);
    //}
}