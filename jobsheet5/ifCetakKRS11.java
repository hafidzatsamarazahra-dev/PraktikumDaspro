package jobsheet5;

import java.util.Scanner;

public class ifCetakKRS11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---cetak KRS siakad---");
        System.out.print("apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = scanner.nextBoolean();

       if (uktLunas) {
            System.out.println("Pembayaran UKT Terferifikasi");
            System.out.println("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak.Silakan lunasi UKT terlebih dahulu");
            }
        
    }

