/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova;

import java.util.Scanner;

/**
 *
 * @author Hugo
 */
public class Prova {
// declaração recursiva do método fibonacci
    public static long fibonacci( long number ) {
        if ( ( number == 0 ) || ( number == 1 ) ) // casos básicos
            return number;
        else // passo de recursão
            return fibonacci( number - 1 ) + fibonacci( number - 2 );
    } // fim do método fibonacci
      
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
        // TODO code application logic here
        System.out.println("Digite um numero ");
        Scanner leitor  =  new Scanner(System.in);
        int n = leitor.nextInt();
        for ( int counter = 0; counter <= n; counter++ )
            System.out.printf( "Fibonacci of %d is: %d\n", counter, fibonacci( counter ) );
        
    ///////////////////////////////////////////////////////////////////
    
        int a = 0;
        int b = 1;
        int x ; 
        for (int i = 0 ; i < n ; i++){
            System.out.println(a);
            x = b;
            b = a;
            a = a + x;
        }   
    }
        
        
    
    }