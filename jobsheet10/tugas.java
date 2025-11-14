package jobsheet10;
import java.util.Scanner;
public class tugas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] survey = new int[10][6];

        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1));
            for (int j = 0; j < 6; j++) {
                System.out.print("Nilai pertanyaan " + (j + 1) + ": ");
                survey[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nRata-rata setiap responden:");
        for (int i = 0; i < 10; i++) {
            int total = 0;
            for (int j = 0; j < 6; j++) {
                total += survey[i][j];
            }
            System.out.println("Responden " + (i + 1) + ": " + (total / 6.0));
        }

        System.out.println("\nRata-rata setiap pertanyaan:");
        for (int j = 0; j < 6; j++) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                total += survey[i][j];
            }
            System.out.println("Pertanyaan " + (j + 1) + ": " + (total / 10.0));
        }

        int totalKeseluruhan = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 6; j++) {
                totalKeseluruhan += survey[i][j];
            }
        }

        System.out.println("\nRata-rata keseluruhan: " + (totalKeseluruhan / 60.0));
    }
}