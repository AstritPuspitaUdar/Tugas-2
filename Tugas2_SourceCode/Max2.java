/*Astrit Puspita Udar
 * B1
 * 13020210245
 * 22-3-2023 20.03
 */
package max2;
import java.util.Scanner;
public class Max2 {

    public static void main(String[] args) {
        // TODO code application logic here
        int a, b;
        Scanner masukan=new Scanner(System.in);
        /* Program */
    System.out.print ("Maksimum dua bilangan : \n"); 
    System.out.print ("Ketikkan dua bilangan, pisahkan dg RETURN : \n");
    a=masukan.nextInt(); 
    b=masukan.nextInt();
    System.out.println ("Ke dua bilangan : a = "+ a+" b = "+b);
    if (a >= b){
    System.out.println ("Nilai a yang maksimum "+ a);
    }else /* a > b */{
    System.out.println ("Nilai b yang maksimum: "+ b);
}
    }
    
}
