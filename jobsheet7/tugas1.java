package jobsheet7;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalTiket = 0;
        double totalPenjualan = 0;
        int hargaTiket = 50000;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk selesai): ");
            int jumlah = sc.nextInt();

            if (jumlah < 0) {
                System.out.println("Jumlah tiket tidak boleh negatif. Coba lagi.");
                continue;
            }

            if (jumlah == 0) {
                break;
            }

            double diskon = 0;
            if (jumlah > 4) {
                diskon = 0.1;
            } else if (jumlah > 10) {
                diskon = 0.15;
            }

            double hargaTotal = jumlah * hargaTiket * (1 - diskon);
            totalTiket += jumlah;
            totalPenjualan += hargaTotal;
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.printf("Total penjualan tiket: Rp " + totalPenjualan);
    }
}

