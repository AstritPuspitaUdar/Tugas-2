/*Astrit Puspita Udar
 * B1
 * 13020210245
 * 22-3-2023 21.36
 */
package printxwhile;
import java.util.Scanner;
public class PrintXWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Sum;
        int x;
        Scanner masukan=new Scanner(System.in);
    /* Program */
    
    Sum = 0; /* Inisialisasi */
    System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
    x = masukan.nextInt();/* First Elmt*/
    while (x != 999) /* Kondisi berhenti */ { 
    Sum = Sum + x; /* Proses */
    System.out.print("Masukkan nilai x (int), akhiri dg 999 : ");
    x = masukan.nextInt();/* First Elmt*/
}
    System.out.println("Hasil penjumlahan = "+ Sum); /* Terminasi */

    }
    
}
