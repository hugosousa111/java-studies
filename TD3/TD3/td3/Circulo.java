package td3;
public class Circulo extends Ponto{
    private double raio;
    
    public String descreveForma(){
        return "Raio do Circulo: "+String.valueOf(raio)+" e "+super.descreveForma();
    }
    public double getraio(){
        return raio;
    }
    public void setraio(int raio){
        this.raio=raio;
    }
    Circulo(){
        super(0,0); 
        raio=0;
    }
    Circulo(int x, int y, double raio){
        super(x, y);
        this.raio = raio;
    }
}