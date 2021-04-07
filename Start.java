import greenfoot.*;  

/**
 * Aceasta Clasa ruleaza jocul.
 */
public class Start extends Meniu
{

    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new MyWorld());

        }
    }    
}
