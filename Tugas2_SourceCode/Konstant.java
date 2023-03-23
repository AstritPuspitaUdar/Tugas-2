/*Astrit Puspita Udar
 * B1
 * 13020210245
 * 22-3-2023 19.42
 */
package konstant;
import java.util.Scanner;
public class Konstant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final float PHI = 3.1415f;
        float r;
        Scanner masukan=new Scanner(System.in);
        /* program */ /* baca data */
        
        System.out.print ("Jari-jari lingkaran ="); 
        r = masukan.nextFloat();
        /* Hitung dan tulis hasil */
        System.out.print ("Luas lingkaran = "+ (PHI * r * r)+"\n");
        System.out.print ("Akhir program \n");

    }
    
}
