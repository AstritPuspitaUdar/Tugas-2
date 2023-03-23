/*Astrit Puspita Udar
 * B1
 * 13020210245
 * 22-3-2023 15.30
 */
package if1;

import java.util.Scanner;
public class If1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner masukan=new Scanner(System.in); 
        int a;
        /* Program */
        System.out.print ("Contoh IF satu kasus \n"); 
        System.out.print ("Ketikkan suatu nilai integer : "); 
        a = masukan.nextInt();
        if (a >= 0)
        System.out.print ("\nNilai a positif "+ a);
    }
    
}
