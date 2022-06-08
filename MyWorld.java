import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int counter = 0;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        Flappy flappyBird = new Flappy();
        addObject(flappyBird,100,100); 
    }
    
    public void act(){
        counter++;
        if(counter == 100){
            counter = 0;
            Pipe pipe = new Pipe();
            
            GreenfootImage image = pipe.getImage();
            
            addObject(pipe, getWidth(), getHeight()/2 + image.getHeight()/2);
            
        }
    }
}
