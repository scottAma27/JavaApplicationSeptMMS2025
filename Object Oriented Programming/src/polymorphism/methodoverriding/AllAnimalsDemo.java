// plymorphsim: makes ork easer to  

package polymorphism.methodoverriding;

public class AllAnimalsDemo {
    public static void main (String [] args){
        Animal [] animalObject = {
            new Dog(),
            new Cat(),
            new Lion ()
        };
        
        for(Animal animal : animalObject){
            animal.sound();
        }
        
    /*
            Or you can use this:
        
        Animal animalObject;
        
        animalObject = new Dog();
        animalObject.sound();
        
        animalObject = new Cat();
        animalObject.sound();
        
        animalObject = new Lion();
        animalObject.sound();
    */
            }
}

