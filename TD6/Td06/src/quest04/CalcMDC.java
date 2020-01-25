/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest04;

/**
 *
 * @author Hugo
 */
public class CalcMDC {
    
    public static int mdc(int x, int y){
        int a,b; 
        if (y == 0){
            return x;
        }else{
            a = y;
            b = x%y;
            return mdc(a,b);
        }
    }
}
