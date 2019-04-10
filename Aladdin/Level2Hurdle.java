import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Level2 hurdles. These will be faster
 * 
 * @author (team-inferno) 
 * @version (a version number or a date)
 */
public class Level2Hurdle extends Actor
{
    int Hur_Speed2 = -8;
    int Hur_Speed3 = -5;
    public Level2Hurdle(){
    GreenfootImage image = getImage();
        image.scale(image.getWidth() - 10, image.getHeight() - 10);
        setImage(image);
    
    }
    
    /**
     * Act - do whatever the Level2Hurdle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX() + Hur_Speed2, getY());
        
    }    
}
