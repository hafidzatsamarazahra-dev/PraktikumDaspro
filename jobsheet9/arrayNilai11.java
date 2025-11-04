package jobsheet9;
import java.util.Scanner;
public class arrayNilai11 {
    public static void main(String[] args) {
        int [] nilaiAkhir = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("masukkan nilai akhir ke " +i+ ": ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("nilai akhir ke " +i+ " adalah: " +nilaiAkhir[i]);
        }
    }
}
