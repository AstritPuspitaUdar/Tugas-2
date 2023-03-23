/*Astrit Puspita Udar
 * B1
 * 13020210245
 * 22-3-2023 20.24
 */
package printiterasi;
import java.util.Scanner;

public class PrintIterasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        int i;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Nilai N >0 = "); /* Inisialisasi*/
        N = masukan.nextInt();
        
        i = 1; /* First Elmt */
        System.out.print ("Print i dengan ITERATE : \n");
        for (;;){
             System.out.println(i); /* Proses */
             if (i == N)
                 /* Kondisi Berhenti */ break;
             else {
                  i++; /* Next Elmt */
            }
    } /* (i == N) */
    }
    
}
