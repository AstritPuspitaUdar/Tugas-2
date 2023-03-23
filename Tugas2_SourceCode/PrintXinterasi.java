/*Astrit Puspita Udar
 * B1
 * 13020210245
 * 22-3-2023 21.12
 */
package printxinterasi;
import java.util.Scanner;

public class PrintXinterasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Sum=0; 
        int x;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
        x = masukan.nextInt(); /* First Elmt */
        if (x == 999){
            System.out.print ("Kasus kosong \n");
    }else{ /* MInimal ada satu data yang dijumlahkan*/
            
    Sum = x; /* Inisialisasi; invariant !! */
    for (;;){
    System.out.print ("Masukkan nilai x (int),akhiri dg 999 : ");
    x = masukan.nextInt(); /* Next Elmt */
    if(x==999)
    break;
    else{
    Sum = Sum + x; /* Proses */
        }
    }
}
System.out.println("Hasil penjumlahan = "+ Sum);
/* Terminasi */
    }
    
}
