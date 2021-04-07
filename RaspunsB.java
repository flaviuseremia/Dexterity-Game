import greenfoot.*;  

/**
 * Aceasta clasa este desemnata pentru raspunsuri.
 */
public class RaspunsB extends Scroller
{   
    private static GreenfootImage[] raspunsuriB= new GreenfootImage[39]; 
    public void act() 
    {
        
    }  
    
    public void AddRaspunsuriB(){
        for(int i=0;i<raspunsuriB.length;i++){
           raspunsuriB[i]= new GreenfootImage(i+"gresit.png");
        }
    }
    /**
     * metoda setB seteaza imaginea corespunzatoare raspunsului care trebuie afisat
       in concordanta cu raspunsul celalalt si intrebarea.
     */
    public void setB(int x){
       GreenfootImage rasp=new GreenfootImage(x+"gresit.png");
        setImage(rasp);
        
    }
}
