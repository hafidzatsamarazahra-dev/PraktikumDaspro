package jobsheet9;
import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1️⃣ Input jumlah mahasiswa
        System.out.print("Masukkan banyaknya nilai mahasiswa yang akan diinput: ");
        int jumlah = sc.nextInt();

        // 2️⃣ Deklarasi array untuk menyimpan nilai mahasiswa
        int[] nilai = new int[jumlah];

        // 3️⃣ Input nilai-nilai mahasiswa
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        // 4️⃣ Hitung rata-rata, nilai tertinggi, dan nilai terendah
        int total = 0;
        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 0; i < jumlah; i++) {
            total += nilai[i];
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        double rataRata = (double) total / jumlah;

        // 5️⃣ Tampilkan semua hasil
        System.out.println("\n=== HASIL DATA NILAI MAHASISWA ===");
        System.out.println("Daftar nilai yang dimasukkan:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }

        System.out.println("\nNilai rata-rata: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
    }
}

