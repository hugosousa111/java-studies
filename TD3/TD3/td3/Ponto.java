package td3;
public class Ponto{
    private int x;
    private int y;
    public String descreveForma(){
        return "Coordenadas do Ponto: ("+String.valueOf(x)+", "+String.valueOf(y)+")";
    }
    public int getx(){
        return x;
    }
    public void setx(int x){
        this.x=x;
    }
    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y=y;
    }
    Ponto() {
        x=0; 
        y=0;
        }
    Ponto(int x, int y){
        this.x=x; 
        this.y=y;
        }    
    } 