package jobsheet8;
import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int jumlahKuadrat = 0;
            String detail = "";
            for (int j = 1; j <= i; j++) {
                jumlahKuadrat += j * j;
                detail += j * j;
                if (j < i) {
                    detail += " + ";
                }
            }

            System.out.println("n = " + i + " → jumlah kuadrat = " + detail + " = " + jumlahKuadrat);
        }
    }
}

