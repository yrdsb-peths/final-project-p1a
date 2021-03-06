import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class is responsible of the transition from title page to the mainroom
 * 
 * @Steven Zhu, Bill Wei, Eric Chen
 * @Jan 20, 2022
 */
public class Main extends TransitionAnimation
{
    /**
     * Act - do whatever the Title wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] image = new GreenfootImage[6];
    SimpleTimer fading = new SimpleTimer();
    int titleI = 0;

    public Main(){
        fading.mark();
        setTitlePage();
        setCurrPage();
    }

    public void setCurrPage()
    {
        setImage(image[titleI]);
    }

    public void setTitlePage()
    {
        for(int i=0; i<6; i++){
            image[i] = new GreenfootImage("T" + i + ".png");
        }
    }

    public void update(){

        if (fading.millisElapsed() > 100){
            fading.mark();
            titleI++;
            setCurrPage();
           
        }
       
    }

}
