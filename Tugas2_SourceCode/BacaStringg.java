/*Astrit Puspita Udar
 * B1
 * 13020210245
 * 22-3-2023 14.56
 */
package bacastringg;
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;

import javax.swing.*; 

public class BacaStringg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String str;
        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));
        /* Program */
        System.out.print ("\nBaca string dan Integer: \n"); 
        System.out.print("masukkan sebuah string: ");
        str= datAIn.readLine();
        System.out.print ("String yang dibaca : "+ str );
    }
    
}
