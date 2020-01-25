import greenfoot.*; // imports Actor, World, Greenfoot, GreenfootImage
/**
 * TrafficLight - uma classe para representar semáforos.
 *
 */
public class TrafficLight extends Actor
{
    private int counter;
    private boolean freePassage;
    /**
     * Construtor para objetos da classe TrafficLight
     */
    public TrafficLight()
    {
        setCounter(0);
        /* Math.round(Math.random()*1) - returns 0 or 1
         * if equals to 0 -> red light
         * if equals to 1 -> green light
         */
        if(Math.round(Math.random()*1) == 0)
        {
            setFreePassage(false);
            setImage("TrafficLightRed.png");
        }
        else
        {
            setFreePassage(true);
            setImage("TrafficLightGreen.png");
        }
    }

    /**
     * Liga/desliga o semáforo.
     */
    public void act()
    {
        setCounter(getCounter()+1);
        if(getCounter()%20 == 0) // atualiza o status do semáforo para cada vinte rodadas
        {
            if(getFreePassage())
            {
                setFreePassage(false);
                setImage("TrafficLightRed.png");
            }
            else
            {
                setFreePassage(true);
                setImage("TrafficLightGreen.png");
            }
           
        }
    }

    /**
     * Modifica o valor do contador que é relacionado ao semáforo.
     *
     * @param value novo valor do contador
     */
    public void setCounter(int value)
    {
        this.counter = (value >= 0 ? value : 0);
    }

    /**
     * Recupera o valor do contador que é relacionado ao semáforo.
     *
     * @return o valor atual do atributo contador
     */
    public int getCounter()
    {
        return this.counter;
    }

    /**
     * Modifica o valor de freePassage que indica quando um carro pode passar direto.
     *
     * @param status novo status do semáforo
     */
    public void setFreePassage(boolean status)
    {
        this.freePassage = status;
    }

    /**
     * Recupera o status do semáforo.
     *
     * @return status do semáforo
     */
    public boolean getFreePassage()
    {
        return this.freePassage;
    }
}