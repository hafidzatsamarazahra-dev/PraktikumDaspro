package jobsheet5;
import java.util.Scanner;
public class switchCetakKRS11 {
    public static void main(String[] args) {
        System.out.println("---cetak KRS siakad---");
        System.out.print("masukkan semester saat ini:" );
        int semester = new Scanner(System.in).nextInt();

        switch (semester) {
            case 1:
            System.out.println("KRS semester 1 di tampilkan");
            break;
            case 2:
            System.out.println("KRS semester 2 di tampilkan");
            break;
            case 3:
            System.out.println("KRS semester 3 di tampilkan");
            break;
            case 4:
            System.out.println("KRS semester 4 di tampilkan");
            break;
            case 5:
            System.out.println("KRS semester 5 di tampilkan");
            break;
            case 6:
            System.out.println("KRS semester 6 di tampilkan");
            break;
            case 7:
            System.out.println("KRS semester 7 di tampilkan");
            break;
            case 8:
            System.out.println("KRS semester 8 di tampilkan");
            break;
            default:
            System.out.println("semester tidak valid");
            
        }
    }
    
}
