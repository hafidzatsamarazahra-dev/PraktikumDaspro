package jobsheet8;
import java.util.Scanner;
public class square11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("masukkan nilai N=");
        int N = sc.nextInt();
        for (int iOuter=1;iOuter<=N;iOuter++){
             for(int i=0;i<=N;i++){
            System.out.print("*");
        }
        System.out.println();
        }
    }
}

//jawaban pertanyaan
//1.Jika iOuter=1 diubah jadi iOuter=0`
//  Perulangan luar dimulai dari 0, bukan 1.
//  jadinya, jumlah baris yang dicetak jadi N+1 baris
//  Contoh (N=5):keluar 6 baris bintang
//  karena perulangan berjalan dari 0 sampai N (total N+1 kali).
//2.Jika i=1 diubah jadi i=0
//  Perulangan dalam dimulai dari 0, jadi setiap baris berisi N+1 bintang
//  misalnya (N=5):tiap baris jadi ****** (6 bintang)
//  karena nilai i berjalan dari 0 sampai N (N+1 kali perulangan)
//3.Perulangan luar (iOuter)mengatur jumlah baris bintang yang dicetak
//  Perulangan dalam (i) mengatur jumlah bintang di tiap baris
//  Jadi perulangan luar = vertikal, perulangan dalam = horizontal.
//4.Fungsi System.out.println(); di bawah perulangan dalam
//  Untuk pindah ke baris baru setelah satu baris bintang selesai dicetak.
//  Kalau dihapus, semua bintang dari semua baris akan dicetak dalam satu baris panjang tanpa jeda.
