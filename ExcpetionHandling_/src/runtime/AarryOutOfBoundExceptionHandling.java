package runtime;

public class AarryOutOfBoundExceptionHandling {
    public static void main (String [] args){
        int[] age = {16,21,19,20,14};
        try{
        
        System.out.println("Element at idex 5 is: "+ age[5]);
    }
    catch(ArrayIndexOutOfBoundsException e){
    System.out.println("Invalid array index");
    }
  }
}
