/*  OOP: Object oriented Programing: is a way of writeing program by thinking abount 
	real-life object and how they behave. in short, it is trying to mimick a code that
	happens in real-life and know how they behave.it can olso be used to reate many identity
	using te same class 
		1. Class: it is a blueprint used to create an abject. it helps to know the atributes,
		object and behaviour 
		of the real-life code.
		2. Object:
		3. 
		Constructor: is a speical kind of method that bears the name of the class. 
		it used to inicialise an instance variable 
		Inheritance: it is a core OOp concept that allows one class(child/subclass) 
		to acquire the properties and behaviour(fields and methds)of another class(parents/subclass). 
		Basic idea:
		insted of rewiriting code, you can reuse and exsisting code
		
		=: equals to is an assignment oparator. 
*/

public class Student{
	int studentID;
	String firstNmae;
	String lastName;
	char gender;
	
	// constructor 
	public Student(int studentID,String firstNmae, String lastName, char gender){
		this.studentID = studentID;
		this.firstNmae = firstNmae;
		this.lastName = lastName;
		this.gender = gender;
	}
	

	public void eat(){
		System.out.print("I am eating");
	}
	public void sleep(){
		System.out.print("I am sleeping");
	}
	public void sing(){
		System.out.print("I am singing");
	}
	
}