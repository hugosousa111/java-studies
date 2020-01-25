import greenfoot.*; // imports Actor, World, Greenfoot, GreenfootImage
/**
 * RedCar – uma classe para representar qualquer carro vermelho.
 *
 */
public class RedCar extends Car
{
    private static final int EAST = 0;
    private static final int WEST = 1;
    private static final int NORTH = 2;
    private static final int SOUTH = 3;

    private int direction;
    /**
     * Construtor para objetos da classe RedCar
     */
    private GreenfootImage RedCarRight;
    private GreenfootImage RedCarLeft;
    
    boolean temqvirar = false;
    
    public RedCar()
    {
        RedCarRight  = getImage();
        RedCarLeft = new GreenfootImage(getImage());
        RedCarLeft.mirrorHorizontally();
        
        setDirection(EAST);
    }

    /**
     * Indica qual direção o carro vermelho se movimenta.
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
                    super.turnLeft();                
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
     * Verifica o semáforo e decide o que o carro vermelho pode fazer. Dobrar à direita,
    preferencialmente!
     */
    public boolean verifyTrafficLight()
    {
       // descreva este código
       return super.verifyTrafficLight();
    }
}