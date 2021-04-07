import greenfoot.*;  

/**
 * Clasa aceasta se comporta ca un buton care te readuce inapoi in meniu
 */
public class Inapoi extends Meniu
{

    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Meniul());
        }
    }    
}
