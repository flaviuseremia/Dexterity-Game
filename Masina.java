import greenfoot.*;  

/**
 * Aceasta clasa este desemnata masinii care face deplasarea.
 */
public class Masina extends Actori
{   
    public int score=1,ct,ture=0;
    private int timer=5000;
    public int pct;
    public int apare;
    public void act() 
    {
        handleMovement();
        atingereMargine();
        increaseScore();
        norocos();
        updateTime();
        intrebari();
        atingereObstacol();
    }  

    /**
    @metoda handleMovement misca masina.
     */
    public void handleMovement(){

        if(Greenfoot.isKeyDown("left")){
            if(getX()<250){
                setLocation(getX(),getY());
            }
            else
            {
                setLocation(getX()-3,getY());
            }
        }
        if(Greenfoot.isKeyDown("right")){
            if(getX()>595){
                setLocation(getX(),getY());}
            else
            {
                setLocation(getX()+3,getY());}
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()+3);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()-3);
        }

    }

    private void atingereObstacol(){
        if(isTouching(Butoi.class) && score>499 && pct>4)
        {   Greenfoot.setWorld(new Final());
        } if(isTouching(Butoi.class) && pct<5){
            setLocation(425,425);
            setImage("game over.png");
            Greenfoot.delay(300);
            Greenfoot.setWorld(new Meniul());
        }
    }

    private void atingereMargine(){
        if(isAtEdge()){
            setLocation(getX(),getY()+10);
        } else
        if(getY()>840){
            setLocation(getX(),getY()-5);
        }
    }

    public void ShowStatus(){
        getWorld().showText("Punctaj:"+score,425,20);
        getWorld().showText("Pct:"+pct,650,20);
    }

    public void increaseScore() { 
        ct++;
        if(ct==20){
            ct=0;
            score++;ture++;
        }
        ShowStatus();
    }

    /**
     * metoda norocos adauga la fiecare 150 de puncte un trifoi norocos pe care daca
    il atingi primesti puncte;
     */
    public void norocos(){
        MyWorld addn=(MyWorld)getWorld();

        if(score%150==0){
            addn.addNoroc();
        }
        if(isAtEdge()){
            addn.removeNoroc();
        } 
        if(isTouching(Noroc.class)){
            removeTouching(Noroc.class);
            score=score+20;ture=ture+20;
        }
    }

    /**
     * metoda updateTime are un timer care scade, iar cand ajunge la 0 creste 
    dificultatea jocului.
     */
    private void updateTime(){
        timer--;
        if(timer<1){
            MyWorld lvlup=(MyWorld)getWorld();
            lvlup.increaseLevel();
            timer=5000;
        }
    }

    /**
     * metoda intrebari adauga intrebarile pe ecran si le sterge.
     */
    public void intrebari(){
        if(ture==100)
        {  int x=Greenfoot.getRandomNumber(2);
            int aps=0;
            int y=Greenfoot.getRandomNumber(825);
            int z=Greenfoot.getRandomNumber(825);
            if (x==0){
                MyWorld intreb=(MyWorld)getWorld();
                intreb.addIntrebare();
                intreb.addRaspunsAInStanga();
                intreb.addRaspunsBInDreapta();
                intreb.setareImage();
                intreb.addSageti();      
                ture=0; 
                apare=0;
                Greenfoot.delay(500); 
                intreb.removeIntrebare();
                intreb.removeRaspunsA();
                intreb.removeRaspunsB();
                intreb.removeSageti();
                if(Greenfoot.isKeyDown("a")&& apare==0){
                    pct++;
                    apare=1;
                    aps=aps+1;
                }
                if(Greenfoot.isKeyDown("b")&& apare==0){
                    pct--;
                    apare=1;
                    aps=aps+1;
                }
            }else
            {
                MyWorld intreb=(MyWorld)getWorld();
                intreb.addIntrebare();
                intreb.addRaspunsAInDreapta();
                intreb.addRaspunsBInStanga();
                intreb.setareImage();
                intreb.addSageti();       
                ture=0; 
                apare=0;
                Greenfoot.delay(500);
                intreb.removeIntrebare();
                intreb.removeRaspunsA();
                intreb.removeRaspunsB();
                intreb.removeSageti();
                if(Greenfoot.isKeyDown("b")&& apare==0){
                    pct++;
                    apare=1;
                }
                if(Greenfoot.isKeyDown("a")&& apare==0){
                    pct--;
                    apare=1;
                }
            } 
        }
    }

}
