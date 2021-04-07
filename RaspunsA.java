import greenfoot.*;  

/**
 * Clasa aceasta este desemnata pentru raspunsuri.
 */
public class RaspunsA extends Scroller
{   
    private static GreenfootImage[] raspunsuriA= new GreenfootImage[39];
    public void act() 
    {

    }  

    public void AddRaspunsuriA(){
        for(int i=0;i<raspunsuriA.length;i++)
        {   raspunsuriA[i]=new GreenfootImage(i+"corect.png");
        }
    } 
    /**
     * metoda setA seteaza imaginea corespunzatoare raspunsului care trebuie afisat
       in concordanta cu raspunsul celalalt si intrebarea.
     */
    public void setA(int x){
        GreenfootImage rasp=new GreenfootImage(x+"corect.png");
        setImage(rasp);

    }

}