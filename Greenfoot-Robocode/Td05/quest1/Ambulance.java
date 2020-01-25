import greenfoot.*; // imports Actor, World, Greenfoot, GreenfootImage
/**
 * Ambulance – uma classe para representas as ambulâncias.
 *
 */
public class Ambulance extends Car
{
    /**
     * Construtor para objetos da classe Ambulance
     */
    private static final int EAST = 0;
    private static final int WEST = 1;
    private static final int NORTH = 2;
    private static final int SOUTH = 3;

    private int direction;
    
    private GreenfootImage AmbulanceRight;
    private GreenfootImage AmbulanceLeft;

    public Ambulance()
    {
        AmbulanceRight  = getImage();
        AmbulanceLeft = new GreenfootImage(getImage());
        AmbulanceLeft.mirrorHorizontally();
        
        setDirection(EAST);
    }

    /**
     * Indica qual direção a ambulância se movimenta.
     */
    public void act()
    {
        // descreva este código
        super.act();
    }

    /**
     * Não verifica o semáforo e a ambulância segue seu caminho.
     */
    public boolean verifyTrafficLight()
    {
        // nenhum semáforo deve ser considerado! – prioridade no tráfego para a
        //  ambulância...
        // descreva este código
        return true;
    }
}