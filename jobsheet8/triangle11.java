package jobsheet8;
import java.util.Scanner;
public class triangle11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("maukkan nilai n=");
        int n = sc.nextInt();
        int i = 0;
        while (i <= n){
            int j = 0;
            while(j <i){
                System.out.println('*');
                j++;
            }
            i++;
        }
    }
}
