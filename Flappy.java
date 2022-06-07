import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An angry bird that runs through the world
 * @author Kelvin Cao 
 * @version 1
 */
public class Flappy extends Actor
{
   int fall = 0;
   int g = 2;
   int boost = -20;
    
    public Flappy()
    {
        GreenfootImage myImage = getImage();
        int myHeight = (int)myImage.getHeight()/4;
        int myWidth = (int)myImage.getWidth()/4;
        myImage.scale(myHeight, myWidth);
    }
    
    /**
     * Act - do whatever the Flappy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       setLocation(getX(), getY() + fall);
       
       //moves up using the up arrow key
       if(Greenfoot.isKeyDown("up")) {
           fall = boost;
        }
       
       if(fall > -10 && fall < 10){
           setRotation(30);
        }
        
       //stops the game if object reaches the bottom of the world
       if(getY() > getWorld().getHeight()) {
           System.out.println("Game Over");
           Greenfoot.stop();
        }
        
       
       fall = fall + g;
    }    
}
