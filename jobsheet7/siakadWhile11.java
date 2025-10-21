package jobsheet7;
import java.util.Scanner;
public class siakadWhile11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int nilai,jml,i=0;

    System.out.print("masukkan jumlah mahasiswa : ");
    jml = sc.nextInt();

    while (i < jml) {
        System.out.print("masukkan nilai mahasiswa ke-" + (i+1) + " : ");
        nilai = sc.nextInt();

        if (nilai <0 || nilai >100) {
            System.out.println("nilai tidak valid,masukkan lagi nilai yang valid");
            continue;
        }
        if (nilai >80 && nilai <=100){
            System.out.println("nilai mahasiswa ke-" + (i+1) + " adalah A");
            System.out.println("Bagus,pertahankan nilainya!");
        } else if (nilai >73 && nilai <=80){
            System.out.println("nilai mahasiswa ke-" + (i+1) + " adalah B+");
        } else if (nilai >65 && nilai <=73){
            System.out.println("nilai mahasiswa ke-" + (i+1) + " adalah B");
        } else if (nilai >60 && nilai <=65){
            System.out.println("nilai mahasiswa ke-" + (i+1) + " adalah C+");
        } else if (nilai >50 && nilai <=60){
            System.out.println("nilai mahasiswa ke-" + (i+1) + " adalah C");
        } else if (nilai >39 && nilai <=50){
            System.out.println("nilai mahasiswa ke-" + (i+1) + " adalah D");
        } else {
            System.out.println("nilai mahasiswa ke-" + (i+1) + " adalah E");
        }
        i++;
    }
} }

//jawaban pertanyaan
//1.a. nilai < 0 || nilai > 100
//     Ini adalah kondisi logika OR dalam pernyataan if. Artinya:
//     nilai < 0: Nilai yang dimasukkan lebih kecil dari 0 (misalnya: -5).
//     nilai > 100: Nilai yang dimasukkan lebih besar dari 100 (misalnya: 105).
//     Operator || berarti salah satu dari kondisi tersebut benar, maka keseluruhan kondisi dianggap benar.
//     ini untuk Mengecek apakah nilai berada di luar rentang 0 sampai 100. Jika ya, maka dianggap tidak valid.
//   b. continue
//     Perintah continue digunakan dalam perulangan (looping), seperti for, while, atau do-while.
//     Ketika program menemukan perintah continue, maka iterasi saat ini akan dilewati, dan program akan langsung melanjutkan ke iterasi berikutnya dari loop.
//2.Penulisan i++ di akhir perulangan (while) bertujuan agar:
//  Isi perulangan dijalankan terlebih dahulu dengan nilai i saat ini.
//  Setelah proses selesai, barulah i ditambah satu.
//  Lalu kembali dicek kondisi while (misalnya i < 5), apakah masih memenuhi.
//  jika i++ dituliskan di awal perulangan
//  Nilai i akan langsung bertambah sebelum proses dijalankan.
//  Akibatnya, satu iterasi awal akan terlewat.
//3.Perulangan akan berjalan sebanyak 19 kali