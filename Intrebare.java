import greenfoot.*;  

/**
 * Aceasta Clasa este creata pentru a afisa intrebari.
 */
public class Intrebare extends Scroller
{   
    private static GreenfootImage[] intrebari= new GreenfootImage[39];
    public void act() 
    {
               
    } 

    public void AddIntrebari(){
        for(int i=0;i<intrebari.length;i++){
            intrebari[i]=new GreenfootImage("intrebare "+i+"-done.png");
        }
    }   
    /**
     * metoda set seteaza imaginea corespunzatoare intrebarii care trebuie afisat
       in concordanta cu raspunsurile.
     */
    public void set(int x){
        GreenfootImage intreba=new GreenfootImage("intrebare "+x+"-done.png");
          setImage(intreba);
    }
    
}
