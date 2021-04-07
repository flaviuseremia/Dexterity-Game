import greenfoot.*;

/**
 *Aceasta clasa este predestinata povestiri jocului.
 */
public class Povestire extends World
{

    public Povestire()
    {    

        super(850, 850, 1); 
        prepare();
    }

    private void prepare()
    {
        Inapoi inapoi = new Inapoi();
        addObject(inapoi,728,757);
    }
}
