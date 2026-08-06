package abtraction;

public class Nokia3310 implements Callabale, Music, Game{
    
    @Override
    public void makeCall(){
        System.out.println("mom is calling..........");
    }
    
     @Override
     public void playMusic(){
          System.out.println("music is playing..........");
     }
     
     @Override
     public void playGame(){
          System.out.println("He's playing game..........");
     }
}