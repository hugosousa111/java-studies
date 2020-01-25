/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TC02;

/**
 *
 * @author Hugo
 */
public class Camera {
    private int pixel;
    
    public Camera(int pix){
        pixel=pix;
    }
    public String toString(){
        return String.format("Câmera com %d megapixel",pixel);
    }
}
