import greenfoot.*;  

/**
 * Aceasta Clasa te duce in lumea unde este Povestea.
 */
public class Poveste extends Meniu
{

    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Povestire());

        }
    }    
}
