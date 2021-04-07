import greenfoot.*;
/**
 * Aceasta clasa este menita pentru a aduga obiectele in joc si pentru a le scoate
 * @Eremia Flavius && @Andreea Dumitrascu 
 * @version 2.23.2018
 */
public class MyWorld extends World
{
    private Background img0,img1;
    int timer;
    int currentLevel=1;
    Noroc trifoi = new Noroc();
    Ospatar Ospatar= new Ospatar();
    Butoi butoi3= new Butoi();
    Butoi butoi4= new Butoi();
    Intrebare intrebare = new Intrebare();
    RaspunsA raspunsA = new RaspunsA();
    RaspunsB raspunsB = new RaspunsB();
    SageataA SageataA = new SageataA();
    SageataB SageataB = new SageataB();
    public MyWorld()
    {    
        super(850, 850, 1,false);
        prepare();
        spawn();
    }

    /**
     * Aceasta metoda deruleaza imaginea de background.
     */
    public void act()
    {

        img0.scroll();
        img1.scroll();

    }

    public void spawn() {

        addObject(new Butoi(),300,580);
        addObject(new Butoi(),550,800);

    }

    public void setUpLevel() {
        if(currentLevel==2){
            addObject(butoi3,300,700);
        } else
        if(currentLevel==3){
            addObject(butoi4,300,490);
        }
    }

    public void increaseLevel() {
        currentLevel++;
        setUpLevel();
    }

    public void addNoroc(){
        addObject(trifoi,500,800);
    }

    public void removeNoroc(){
        removeObject(trifoi);
    }

    public void addIntrebare(){
        addObject(intrebare,595,340);

    }

    public void addRaspunsAInStanga(){
        addObject(raspunsA,190,630);   
    }

    public void addRaspunsAInDreapta(){
        addObject(raspunsA,670,630);   
    }

    public void addRaspunsBInDreapta(){
        addObject(raspunsB,670,630);   
    }

    public void addRaspunsBInStanga(){
        addObject(raspunsB,190,630);   
    }

    public void addSageti(){
        addObject(SageataA,100,460);
        addObject(SageataB,750,460);
    }
    public void addButonInapoi(){
        addObject(new Inapoi(),600,700);
    }
    public void removeIntrebare(){
        removeObject(intrebare);
    }

    public void setareImage(){
        int x=Greenfoot.getRandomNumber(39);
        intrebare.set(x);
        raspunsA.setA(x);
        raspunsB.setB(x);
    }

    public void removeRaspunsA(){
        removeObject(raspunsA);
    }

    public void removeRaspunsB(){
        removeObject(raspunsB);
    }

    public void removeSageti(){
        removeObject(SageataA);
        removeObject(SageataB);

    }

    private void prepare()
    {  
        img0 = new Background();
        addObject(img0,getWidth()/2,getHeight()/2);

        img1= new Background();
        addObject(img1,getWidth()/2,getHeight()+getHeight()/2);

        Masina masina = new Masina();
        addObject(masina,430,56);

        Semn semn = new Semn();
        addObject(semn,645,809);
    }

}
