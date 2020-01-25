import greenfoot.*;
import java.util.Random;
/**
 * Uma simulação de tráfego com carros e semáforos.
 *
 * Define o layout dos objetos no mundo.
 */
public class TrafficWorld extends World
{
    private int x;
    private Random randomizer = new Random();
    /**
     * Construtor para objetos da classe TrafficWorld
     *
     * Cria um novo mundo com células 8x8 e com uma célula maior de 60x60 pixels
     */
    public TrafficWorld()
    {
        super(9, 9, 65);
        setBackground("sand.jpg");
    }
    
    /**
     * Povoar o mundo com um cenário fixo de carros e semáforos.
     */
    public void populate()
    {
        RedCar rc = new RedCar();
        addObject(rc, 4, 0); // posiciona o objeto por [coluna,linha]
        GreenCar gc = new GreenCar();
        addObject(gc, 4, 8);
        BlueCar bc = new BlueCar();
        addObject(bc, 0, 4);
        Ambulance ambulance = new Ambulance();
        addObject(ambulance, 4, 4);
        TrafficLight tl1 = new TrafficLight();
        addObject(tl1, 0, 1);
        TrafficLight tl2 = new TrafficLight();
        addObject(tl2, 8, 1);
        TrafficLight tl3 = new TrafficLight();
        addObject(tl3, 0, 7);
        TrafficLight tl4 = new TrafficLight();
        addObject(tl4, 8, 7);
        TrafficLight tl5 = new TrafficLight();
        addObject(tl5, 4, 1);
        TrafficLight tl6 = new TrafficLight();
        addObject(tl6, 4, 7);
        TrafficLight tl7 = new TrafficLight();
        addObject(tl7, 4, 4);
    }

    /**
     * Liga e desliga as luzes no semáforo apresentado.
     *
     * @param numLights numero de semáfotos que são inseridos no mundo
     */
    public void randomLights(int numLights)
    {
        for(int i=0; i<numLights; i++) {
            TrafficLight tl = new TrafficLight();
            int x = Greenfoot.getRandomNumber(getWidth());
            int y = Greenfoot.getRandomNumber(getHeight());
            addObject(tl, x, y);
        }
    }
}