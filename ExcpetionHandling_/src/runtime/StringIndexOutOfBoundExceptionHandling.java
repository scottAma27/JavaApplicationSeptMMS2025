package runtime;

public class StringIndexOutOfBoundExceptionHandling {
    public static void main (String [] args){
        String myName = "John James";
        try{
        
        System.out.println(myName.charAt(11));        
    }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("Invalid string index");
        }
    }
}
