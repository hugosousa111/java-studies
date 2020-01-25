import greenfoot.*; // imports Actor, World, Greenfoot, GreenfootImage
/**
 * BlueCar – uma classe para representar qualquer carro azul.
 *
 */
public class BlueCar extends Car
{
    private static final int EAST = 0;
    private static final int WEST = 1;
    private static final int NORTH = 2;
    private static final int SOUTH = 3;

    private int direction;
    /**
     * Construtor para objetos da classe BlueCar
     */
    private GreenfootImage BlueCarRight;
    private GreenfootImage BlueCarLeft;
    
    boolean temqvirar = false;
    public BlueCar()
    {
        BlueCarRight  = getImage();
        BlueCarLeft = new GreenfootImage(getImage());
        BlueCarLeft.mirrorHorizontally();

        setDirection(EAST);
    }

    /**
     * Indica qual direção o carro azul se movimenta.
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
                    super.turnRight();                
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
     * Verifica o semáforo e decide o que o carro azul pode fazer. Dobrar à direita,
    preferencialmente!
     */
    public boolean verifyTrafficLight()
    {
        // descreva este código
        return super.verifyTrafficLight();
    }
}