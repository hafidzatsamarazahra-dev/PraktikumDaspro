package jobsheet10;
import java.util.Scanner;
public class siakad11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nilai = new int[4][3];

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("input nilai mahasiswa ke-" + (i + 1) + ":");
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            System.out.println("nilai rata-rata: " + totalPerSiswa/3);
        }

        System.out.println("\n==========================");
        System.out.println("rata-rata nilai setiap mata kuliah:");

        for (int j = 0; j < 3; j++) {
            double totalPerMatKul = 0;

            for (int i = 0; i < 4; i++) {
                totalPerMatKul += nilai[i][j];
            }
            System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatKul/4);
        }
    }
    
}
