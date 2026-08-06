package abtraction;

public class MainInterface {
    public static void main (String [] args){
        SmartPhone smartPhone = new SmartPhone ();
        
        Nokia3310 nokia = new Nokia3310();
        
        System.out.println("\nSmartPhone interface");
        smartPhone.makeCall();
        smartPhone.takePicture();
        smartPhone.playMusic();
        smartPhone.playGame();
        smartPhone.connectToWiFi();
        smartPhone.playMovie();
        
        System.out.println("\nNokia3310 interface");
        nokia.makeCall();
        nokia.playGame();
        nokia.playMusic();
    }
}
