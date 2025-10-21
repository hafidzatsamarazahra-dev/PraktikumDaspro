package jobsheet7;
import java.util.Scanner;
public class siakadFor11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai,tertinggi=0,terendah=100;
        int i=1,lulus=0,tidakLulus=0;

        for (i=1; i<=10; i++){
            System.out.print("Masukkan nilai mahasiswa ke-"+i+": ");
            nilai = sc. nextDouble();
            if (nilai > tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            }
             if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }
        i++;
        System.out.println("Nilai tertinggi: "+tertinggi);
        System.out.println("Nilai terendah: "+terendah);
        System.out.println("Jumlah mahasiswa lulus: " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus: " + tidakLulus);
    }
}

//jawaban pertanyaan
//1.Inisialisasi: i = 1(menetapkan nilai awal variabel kontrol i)
//  kondisi: i <= 10(Selama kondisi ini true, blok kode di dalam for akan terus dijalankan)
//  Update: i++ (Setelah setiap iterasi, nilai i akan bertambah 1)
//2. tertinggi = 0 Karena kita ingin mencari nilai maksimum dari input nilai mahasiswa.
//               Nilai awal 0 diasumsikan sebagai nilai paling kecil, sehingga saat nilai mahasiswa pertama masuk, jika lebih besar dari 0, nilai itu akan menggantikan nilai tertinggi. Jadi, nilai tertinggi akan selalu diperbarui ke nilai terbesar dari input.
//   terendah = 100 Karena kita ingin mencari nilai minimum dari input nilai mahasiswa.
//           Nilai awal 100 dianggap sebagai nilai terbesar (asumsi nilai maksimal adalah 100). Jadi setiap nilai mahasiswa yang lebih kecil dari 100 akan menggantikan nilai terendah, memastikan nilai terendah akan diperbarui ke nilai terkecil dari input.
//   Jika tertinggi = 100, maka Saat input nilai mahasiswa dimulai, hanya nilai yang lebih besar dari 100 yang bisa menggantikan nilai tertinggi. Karena nilai biasanya antara 0 sampai 100, tidak ada nilai yang lebih besar dari 100, sehingga nilai tertinggi tetap 100, walaupun sebenarnya nilai tertinggi yang benar bisa lebih kecil. Jadi hasilnya salah.
//   Jika terendah = 0, maka Saat input nilai mahasiswa dimulai, hanya nilai yang lebih kecil dari 0 yang bisa menggantikan nilai terendah. Karena nilai biasanya tidak kurang dari 0, nilai terendah tetap 0, padahal nilai terendah yang benar bisa lebih besar. Jadi hasilnya juga salah.
//3. Kode ini digunakan untuk menentukan nilai tertinggi dan terendah dari sejumlah nilai yang dimasukkan (misalnya nilai mahasiswa).
//   Setiap kali ada nilai baru, program memeriksa apakah nilai itu lebih besar dari nilai tertinggi sebelumnya. Kalau iya, nilai tertinggi diperbarui.
//   Lalu, program memeriksa apakah nilai itu lebih kecil dari nilai terendah sebelumnya. Kalau iya, nilai terendah diperbarui.