import greenfoot.*; // imports Actor, World, Greenfoot, GreenfootImage
/**
 * GreenCar – uma classe para representar qualquer carro verde.
 *
 */
public class GreenCar extends Car
{
    private static final int EAST = 0;
    private static final int WEST = 1;
    private static final int NORTH = 2;
    private static final int SOUTH = 3;

    private int direction;
    /**
     * Construtor para objetos da classe GreenCar
     */
    private GreenfootImage GreenCarRight;
    private GreenfootImage GreenCarLeft;
    
    boolean temqvirar = false;
    
    public GreenCar()
    {
        GreenCarRight  = getImage();
        GreenCarLeft = new GreenfootImage(getImage());
        GreenCarLeft.mirrorHorizontally();
        
        setDirection(EAST);
    }

    /**
     * Indica qual direção o carro verde se movimenta.
     */
    public void act()
    {
        // descreva este código
        if (super.foundTrafficLight()){
            if(!verifyTrafficLight()){
                //se verdadeiro, é pq o getfreepassage retornou falso, não pode passar, espera
                temqvirar = true; 
            }else{
                if(temqvirar){
                    super.turn180();                
                    super.act();
                }else{
                    super.act();
                }   
            }
        }else{
            super.act();
        }
        
    }
    

    /**
     * Verifica o semáforo e decide o que o carro verde pode fazer. Dobrar à direita,
    preferencialmente!
     */
    public boolean verifyTrafficLight()
    {
       // descreva este código
       return super.verifyTrafficLight();
    }
}