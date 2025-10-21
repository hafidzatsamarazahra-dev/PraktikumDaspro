package jobsheet7;
import java.util.Scanner;
public class kafeDoWhile11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi,teh,roti,totalHarga;
        String namaPelanggan;

        int hargaKopi=12000;
        int hargaTeh=7000;
        int hargaRoti=20000;

        do {
            System.out.print("\nmasukkan nama pelanggan (ketik 'batal'untuk keluar) : ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("transaksi dibatalkan.");
                System.out.println("semua transaksi selesai.");
                break;
            }
            System.out.print("jumlah kopi:");
            kopi = sc.nextInt();
            System.out.print("jumlah teh:");
            teh = sc.nextInt();
            System.out.print("jumlah roti:");
            roti = sc.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.print("total yang harus dibayar : Rp " + totalHarga);
            sc.nextLine(); 
        } while (true);
    }
    
}
// jawaban pertanyaan
//1.Perulangan do-while tetap berjalan sebanyak 1 kali, meskipun input pertama adalah "batal".
//2.Perintah break saat namaPelanggan.equalsIgnoreCase("batal") terpenuhi.
//3.Fungsi dari penggunaan nilai true pada kondisi do-while adalah untuk membuat perulangan berjalan terus-menerus (infinite loop) hingga dihentikan dengan break.
//4.Perulangan do-while tetap berjalan karena kondisinya true, dan dihentikan oleh input pengguna (yaitu saat mengetik "batal") dengan perintah break.
//  Tidak butuh inisialisasi atau update karena perulangan tidak dikontrol oleh variabel penghitung.