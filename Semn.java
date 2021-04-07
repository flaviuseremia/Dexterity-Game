import greenfoot.*;  

/**
 * Aceasta clasa este creata pentru a derula imaginile unor semne pe marginea drumului.
 */
public class Semn extends Scroller
{
    private GreenfootImage[] semne= new GreenfootImage[39];

    public void act() 
    {
        AddImages();
        adaugare();
        scroll();
    } 

    public void AddImages(){
        for(int i=0;i<semne.length;i++){
            semne[i]=new GreenfootImage(i+".png");
        }
    }

    public void adaugare(){  
        if(isAtEdge()){
            int x=Greenfoot.getRandomNumber(39);    
            setLocation(655,800);
            setImage(semne[x]);

        }
    }

    public void scroll()
    {   if(getY() < -getImage().getHeight()/2){
            setLocation(getX(), getWorld().getHeight()+ getWorld().getHeight()/2-5);
        }
        setLocation(getX(),getY()-1);
    }

}
