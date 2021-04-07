import greenfoot.*;  

/**
 * Clasa Butoi este creata pentru a spawna obstacolele.
 */

public class Butoi extends Scroller
{   
    private int ct;
    private GreenfootImage masina1 = new GreenfootImage("car01-n.png");
    private GreenfootImage butoi = new GreenfootImage("barrel_.png");
    private GreenfootImage masina2 = new GreenfootImage("car03.png");
    public int nu,nu1,nu2,nu3,k;
    public void act() 
    {
        scroll();
        margine();
    }

    public void scroll()
    {   if(getY() < -getImage().getHeight()/2){
            setLocation(getX(), getWorld().getHeight()+ getWorld().getHeight()/2-5);
        }
        setLocation(getX(),getY()-8);      
    }

    /**
     * Metoda margine aseaza obstacolele inapoi la punctul de plecare cand ating
    margine si le seteaza pe o anumita pozitie prestabilita aleatoare si cu o
    imagine aleatoare din cele 3.
     */
    public void margine() {
        if(isAtEdge()){
            int i=Greenfoot.getRandomNumber(3);
            int n;
                n=1+Greenfoot.getRandomNumber(5);          
            if(n==1){
                setLocation(300,800);
                if(i==0){
                    setImage(butoi);}
                if(i==1){
                    setImage(masina1);
                } 
                if(i==2){
                    setImage(masina2);
                }

            }
            if(n==2){
                setLocation(360,800);
                if(i==0){
                    setImage(butoi);}
                if(i==1){
                    setImage(masina1);
                } 
                if(i==2){
                    setImage(masina2);
                }

            }
            if(n==3){
                setLocation(425,800);
                if(i==0){
                    setImage(butoi);}
                if(i==1){
                    setImage(masina1);
                } 
                if(i==2){
                    setImage(masina2);
                }

            }
            if(n==4){
                setLocation(500,800);
                if(i==0){
                    setImage(butoi);}
                if(i==1){
                    setImage(masina1);
                } 
                if(i==2){
                    setImage(masina2);
                }

            }
            if(n==5){
                setLocation(550,800);
                if(i==0){
                    setImage(butoi);}
                if(i==1){
                    setImage(masina1);
                } 
                if(i==2){
                    setImage(masina2);
                }

            }
        }
    }

}