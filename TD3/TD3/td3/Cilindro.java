package td3;
public class Cilindro extends Circulo{
   private double altura;
   
   public String descreveForma(){
       return  "Altura do Circulo: "+String.valueOf(getAltura())+", e "+super.descreveForma();
   }
   public double getAltura(){
       return altura;
   }
   public void setAltura(int altura){
       this.altura=altura;
   }
   Cilindro() {
       super(0,0,0); 
       altura=0; 
   }
    Cilindro(int x, int y, double raio,double altura) {
        super(x, y, raio);
        this.altura = altura;
    }
}
