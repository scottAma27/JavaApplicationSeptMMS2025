package abtraction;

public class SmartPhone implements Callabale, Camera, Music, Game, WiFi, Movie {
    
    @Override
    public void makeCall(){
        System.out.println("John is calling..........");
    }
    
    @Override
     public void takePicture(){
          System.out.println("Picture has been taken..........");
     }
    @Override
     public void playMusic(){
          System.out.println("music is playing..........");
     }
    @Override
     public void playGame(){
          System.out.println("The game is playing..........");
     }
    @Override
     public void connectToWiFi(){
          System.out.println("Connected to the wifi..........");
     }
    @Override
     public void playMovie(){
          System.out.println("Watching a movie..........");
     }
}
