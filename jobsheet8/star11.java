package jobsheet8;
import java.util.Scanner;
public class star11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan nilai n=");
        int n = sc.nextInt();

        for (int i=1; i<=n;i++){
            System.out.print("*");
        }
    }
    
}

//jawaban pertanyaan
//1.Jika i=1 diubah jadi i=0
//  Perulangan dimulai dari 0, jadi dijalankan n+1 kali.
//  misal (n=5): output ****** (6 bintang).
//  Karena i bernilai 0–5 (total 6 kali).
//2.Jika i<=n diubah jadi i<n
//  Perulangan berhenti sebelum i = n, jadi hanya n–1 kali.
//  misalnya (n=5): output **** (4 bintang).
//  Karena i hanya 1–4.
//3.Jika i<=n diubah jadi i>n
//  Kondisi awal langsung salah (1 > n tidak benar),
//  maka tidak ada perulangan sama sekali, output kosong.
//4.Jika i++ diubah jadi i--
//  Nilai i makin kecil terus, sementara kondisi i <= n selalu benar,
//  jadinya perulangan tidak berhenti (infinite loop).
//5.Jika i++ diubah jadi i += 2
//  Nilai i bertambah 2 tiap langkah (1, 3, 5, ...),
//  maka bintang yang tercetak lebih sedikit, hanya separuh dari jumlah normal.
//  Contoh (n=6): output *** (3 bintang).