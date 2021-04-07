import greenfoot.*;

/**
 * Aceasta clasa este finalul care se deblocheaza doar daca ajungi la un anumit punctaj.
 */
public class Final extends World
{
    public Final()
    {    
        super(850, 850, 1); 
        prepare();
    }

    private void prepare()
    {
        Inapoi inapoi = new Inapoi();
        addObject(inapoi,716,755);
        Ospatar ospatar = new Ospatar();
        addObject(ospatar,528,559);
    }
}
