package jobsheet9;
import java.util.Scanner;

public class searchNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jumlah nilai yang akan diinput
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jumlah = sc.nextInt();

        int[] arrNilai = new int[jumlah];

        // Input nilai-nilai mahasiswa
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }

        // Input nilai yang ingin dicari
        System.out.print("Masukkan nilai yang ingin dicari: ");
        int key = sc.nextInt();

        // Pencarian nilai
        int hasil = -1; // -1 berarti belum ditemukan
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }

        // Menampilkan hasil
        if (hasil != -1) {
            System.out.println("\nNilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + (hasil + 1));
        } else {
            System.out.println("\nNilai yang dicari tidak ditemukan");
        }
    }
}


//jawaban pertanyaan
//1.break digunakan untuk menghentikan perulangan (loop) secara paksa sebelum mencapai akhir.