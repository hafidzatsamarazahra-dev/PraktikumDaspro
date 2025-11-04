package jobsheet9;
import java.util.Scanner;
public class arrayRataNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc.nextInt();
        int[] nilaiMahasiswa = new int[jumlahMahasiswa];
        double total = 0;
        double rataRata;
        double totalLulus = 0,totalTidakLulus = 0;
        int jumlahLulus = 0, jumlahTidakLulus = 0;

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = sc.nextInt();
        }
        for (int i = 0; i < jumlahMahasiswa; i++) {
            if (nilaiMahasiswa[i] > 70) {
                totalLulus += nilaiMahasiswa[i];
                jumlahLulus++;
            } else {
                totalTidakLulus += nilaiMahasiswa[i];
                jumlahTidakLulus++;
            }
        }
        if (jumlahLulus > 0) {
            System.out.println("Rata-rata nilai lulus = " + (totalLulus / jumlahLulus));
        } else {
            System.out.println("Tidak ada mahasiswa yang lulus.");
        }

        if (jumlahTidakLulus > 0) {
            System.out.println("Rata-rata nilai tidak lulus = " + (totalTidakLulus / jumlahTidakLulus));
        } else {
            System.out.println("Tidak ada mahasiswa yang tidak lulus.");
        }
        for (int i = 0; i < nilaiMahasiswa.length; i++) {
            total += nilaiMahasiswa[i];
        }
    } }
