import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * An angry bird that runs through the world
 * 
 * @author Kelvin Cao 
 * @version 1
 */
public class Flappy extends Actor
{
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
        // Add your action code here.
    }
}
