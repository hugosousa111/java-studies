package Newpaco;
import java.util.Scanner;
public class ExemploExcecao {
    public static float divide(float numerador, float denominador) throws ArithmeticException{
        if (denominador == 0){
            throw new ArithmeticException();
       }
        return numerador / denominador;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numerador: ");
        float numerador = scan.nextInt();
        System.out.println("Digite um denominador: ");
        float denominador = scan.nextInt();
        try{
            float resultado = divide(numerador, denominador);        
            System.out.println("O resultado é "+ resultado);
        }catch(ArithmeticException e){ //"e" é o objeto da classe ArithmeticException
            System.err.println("ERRO, divisão por zero "+e.getMessage());
        }
    }
}
