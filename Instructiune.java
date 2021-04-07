import greenfoot.*;

/**
 *Aceasta Clasa este predestinata instructiunilor.
 */
public class Instructiune extends World
{

    public Instructiune()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 850, 1); 
        prepare();
    }

    private void prepare()
    {
        Inapoi inapoi = new Inapoi();
        addObject(inapoi,733,786);
    }
}
