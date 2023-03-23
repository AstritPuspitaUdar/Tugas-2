/*Astrit Puspita Udar
 * B1
 * 13020210245
 * 22-3-2023 20.59
 */
package printwhile1;
import java.util.Scanner;

public class PrintWhile1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int N;
        int i = 1;
        Scanner masukan=new Scanner(System.in);
        /* Program */
        
        System.out.print ("Nilai N >0 = "); 
        N = masukan.nextInt();
        System.out.print ("Print i dengan WHILE (ringkas): \n");
        while (i <= N){
        System.out.println (i++);
        } /* (i > N)*/
    }
    
}
