/*Astrit Puspita Udar
 * B1
 * 13020210245
 * 22-3-2023 15.42
 */
package if2;
import java.util.Scanner;

public class If2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
    Scanner masukan=new Scanner(System.in);
    /* Program */
    System.out.print ("Contoh IF dua kasus \n");
    System.out.print ("Ketikkan suatu nilai integer :"); 
    a=masukan.nextInt();
    
    if (a >= 0){
         System.out.println ("Nilai a positif "+ a);
    }else /* a< 0 */
    {
    System.out.println ("Nilai a negatif "+ a);
}
    }
    
}
