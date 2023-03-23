/*Astrit Puspita Udar
 * B1
 * 13020210245
 * 22-3-2023 20.35
 */
package printrepeat;
import java.util.Scanner;

public class PrintRepeat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        
        System.out.print ("Nilai N >0 = ");
        /* Inisialisasi */
        N = masukan.nextInt();
        
        i = 1;
        /* First Elmt */
        System.out.print ("Print i dengan REPEAT: \n");
        do{
            System.out.print (i+"\n"); /* Proses */ 
            i++; /* Next Elmt */
        }
        
        while (i <= N); /* Kondisi pengulangan */

    }
    
}
