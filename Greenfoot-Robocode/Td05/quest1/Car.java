import greenfoot.*; // imports Actor, World, Greenfoot, GreenfootImage
/**
 * Car – uma classe para representar carros.
 * 
 */
public class Car extends Actor
{
    private static final int EAST = 0;
    private static final int WEST = 1;
    private static final int NORTH = 2;
    private static final int SOUTH = 3;

    private int direction;
    
    private GreenfootImage carRight;
    private GreenfootImage carLeft;
    
    /**
     * Construtor para objetos de classe Car
     */
    public Car()
    {
        carRight = getImage();
        carLeft = new GreenfootImage(getImage());
        carLeft.mirrorHorizontally();
        
        setDirection(EAST);
    }

    /**
     * Indica qual direção o carro se movimenta.
     */
    public void act()
    {
        // descreva este código
        //testa se pode se mover, no caso ver apenas se já chegou nos limites do cenário
        if (canMove()){
            //se poder, canMove() retornar verdadeiro, então ele se move
            move();
        } else {
            //senão, chama a função turnRandom(),
            turnRandom();
        }
    }

    /**
     * Checa se há um semáforo na mesma célula em que o carro está.
     */
    public boolean foundTrafficLight()
    {
        // descreva este código
        //ele cria um objeto do tipo ator, chamado TrafficLight, pega a classe Traffic.class que tem naquela posição e joga dentro desse objeto
        Actor TrafficLight = getOneObjectAtOffset(0, 0, TrafficLight.class);
        //se realmente tiver uma classe TrafficLight naquela posição, então o prox if irá ser verdadeiro, e achamos um sinal
        if(TrafficLight != null) {
            return true;
        }
        else {
            //senão, não tem sinal naquela posição
            return false;
        }
    }

    /**
     * Verifica o semáforo e decide o que o carro deve fazer.
     */
    public boolean verifyTrafficLight()
    {
       // descreva este código
       //ele cria um objeto do tipo TrafficLight, chamado TrafficLight, pega a classe Traffic.class 
       //que tem naquela posição, converte para um objeto do tipo TrafficLight, e joga dentro desse objeto
       TrafficLight TrafficLight = (TrafficLight) getOneObjectAtOffset(0, 0, TrafficLight.class); 
       if (TrafficLight.getFreePassage()){ //testo se a passagem está livre, para aquela posição
           return true;
       }
       return false;       
    }

    /**
     * Move uma célula à frente na direção atual.
     */
    public void move()
    {
        // descreva este código
        //se ele não poder se mover, já acaba nesse primeiro if
        if (!canMove()) {
            return;
        }
        switch(direction) {
            //caso ele possa, uma desses casos vai ser satisfeito e o carro irá se mover
            case SOUTH :
            setLocation(getX(), getY() + 1);
            break;
            case EAST :
            setLocation(getX() + 1, getY());
            break;
            case NORTH :
            setLocation(getX(), getY() - 1);
            break;
            case WEST :
            setLocation(getX() - 1, getY());
            break;
        }
    }

    /**
     * Testa se pode mover adiante.
     * Retorna true se pode mover, false em caso contrário.
     */
    public boolean canMove()
    {
        // descreva este código
        World myWorld = getWorld(); //cria um abjeto do tipo World, para receber "o cenário" para ser testado"
        int x = getX();
        int y = getY();
        switch(direction) {
            case SOUTH :
            y++;
            break;
            case EAST :
            x++;
            break;
            case NORTH :
            y--;
            break;
            case WEST :
            x--;
            break;
        }
        // testa se já chegou na borda
        if (x >= myWorld.getWidth() || y >= myWorld.getHeight()) {
            return false;
        }
        // testa se já chegou na borda
        else if (x < 0 || y < 0) {
            return false;
        }
        return true;
    }

    /**
     * Toma uma direção aleatória.
     */
    public void turnRandom()
    {
        // descreva este código
        // escolhe um numero aleatorio de 0 a 4
        int turns = Greenfoot.getRandomNumber(4);
        // gira pra esquerda esse numero vezes
        for(int i=0; i<turns; i++) {
            turnLeft();
        }
    }

    /**
     * Direciona pra esquerda.
     */
    public void turnLeft()
    {
        // descreva este código
        //vira para a esquerda, dependendo de que forma ele estava, entra em um caso diferente
        switch(direction) {
            case SOUTH :
            setDirection(EAST);
            break;
            case EAST :
            setDirection(NORTH);
            break;
            case NORTH :
            setDirection(WEST);
            break;
            case WEST :
            setDirection(SOUTH);
            break;
        }
    }
    public void turnRight()
    {
        // descreva este código
        //vira para a direita, dependendo de que forma ele estava, entra em um caso diferente
        switch(direction) {
            case SOUTH :
            setDirection(WEST);
            break;
            case WEST :
            setDirection(NORTH);
            break;
            case NORTH :
            setDirection(EAST);
            break;
            case EAST :
            setDirection(SOUTH);
            break;
        }
    }
    public void turn180()
    {
        // descreva este código
        //vira para a direção contraria, dependendo de que forma ele estava, entra em um caso diferente
        switch(direction) {
            case SOUTH :
            setDirection(NORTH);
            break;
            case NORTH :
            setDirection(SOUTH);
            break;
            case WEST :
            setDirection(EAST);
            break;
            case EAST :
            setDirection(WEST);
            break;
        }
    }

    /**
     * Modifica a direção a ser seguida.
     */
    public void setDirection(int direction)
    {
        // descreva este código
        this.direction = direction;
        //pega a imagem e gira, conforme a direção que ele irá andar
        switch(direction) {
            case SOUTH :
                setImage(carRight);
                setRotation(90);
                break;
            case EAST :
                setImage(carRight);
                setRotation(0);
                break;
            case NORTH :
                setImage(carLeft);
                setRotation(90);
                break;
            case WEST :
                setImage(carLeft);
                setRotation(0);
                break;
            default :
                break;
        }
   }
}