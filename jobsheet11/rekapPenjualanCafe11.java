package jobsheet11;
import java.util.Scanner;

public class rekapPenjualanCafe11 {

    static Scanner sc = new Scanner(System.in);

    public static void inputPenjualan(int[][] data, String[] menu) {
        System.out.println("=== Input Data Penjualan ===");
        for (int i = 0; i < data.length; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < data[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                data[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    public static void tampilkanData(int[][] data, String[] menu) {
        System.out.println("\n=== Rekap Penjualan ===");
        System.out.print("Menu\t\t");
        for (int i = 1; i <= data[0].length; i++) {
            System.out.print("H" + i + "\t");
        }
        System.out.println();

        for (int i = 0; i < data.length; i++) {
            System.out.print(menu[i] + "\t");
            if (menu[i].length() < 8) System.out.print("\t");
            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void tampilMenuTertinggi(int[][] data, String[] menu) {
        int maxTotal = 0;
        int idx = 0;

        for (int i = 0; i < data.length; i++) {
            int total = 0;
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                idx = i;
            }
        }

        System.out.println("\nMenu dengan total penjualan tertinggi:");
        System.out.println(menu[idx] + " = " + maxTotal);
    }

    public static void tampilRataRata(int[][] data, String[] menu) {
        System.out.println("\n=== Rata-rata Penjualan Tiap Menu ===");
        for (int i = 0; i < data.length; i++) {
            int total = 0;
            for (int j = 0; j < data[i].length; j++) {
                total += data[i][j];
            }
            double rata = (double) total / data[i].length;
            System.out.println(menu[i] + " = " + rata);
        }
    }

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();
        sc.nextLine();

        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = sc.nextInt();
        sc.nextLine();

        String[] menu = new String[jumlahMenu];

        System.out.println("\n=== Input Nama Menu ===");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();
        }

        int[][] penjualan = new int[jumlahMenu][jumlahHari];

        inputPenjualan(penjualan, menu);
        tampilkanData(penjualan, menu);
        tampilMenuTertinggi(penjualan, menu);
        tampilRataRata(penjualan, menu);
    }
}

