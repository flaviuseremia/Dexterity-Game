import greenfoot.*;  

/**
 * Aceasta clasa trece jucatorul in lumea Instructiune.
 */
public class Instructiuni extends Meniu
{

    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Instructiune());
        }
    }    
}
