import greenfoot.*;

/**
 * Aceasta clasa este meniul jocului.
 */
public class Meniul extends World
{
    public Meniul()
    {   super(960,600,1);  
        prepare();
    }

    private void prepare()
    {
        Start start = new Start();
        addObject(start,500,142);
        Instructiuni instructiuni = new Instructiuni();
        addObject(instructiuni,506,294);
        Poveste poveste = new Poveste();
        addObject(poveste,482,448);
        poveste.setLocation(489,491);
        instructiuni.setLocation(509,263);
        start.setLocation(498,99);
        instructiuni.setLocation(507,194);
        start.setLocation(506,82);
        instructiuni.setLocation(502,211);
        poveste.setLocation(484,354);
        start.setLocation(507,93);
        Pig pig = new Pig();
        addObject(pig,868,513);
        pig.setLocation(860,505);
        instructiuni.setLocation(491,223);
        Bula bula = new Bula();
        addObject(bula,649,489);
        bula.setLocation(701,355);
        bula.setLocation(636,476);
        bula.setLocation(647,473);
        poveste.setLocation(466,487);
        instructiuni.setLocation(482,370);
        start.setLocation(483,242);
        instructiuni.setLocation(486,360);
        bula.setLocation(257,283);
        pig.setLocation(115,484);
        start.setLocation(510,242);
        instructiuni.setLocation(533,353);
        poveste.setLocation(504,493);
        bula.setLocation(209,322);
        poveste.setLocation(507,527);
        instructiuni.setLocation(541,398);
        start.setLocation(521,281);
        bula.setLocation(236,323);
        instructiuni.setLocation(529,400);
        poveste.setLocation(518,525);
        start.setLocation(517,281);
    }
}
