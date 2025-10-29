package jobsheet8;
import java.util.Scanner;
public class nilaiKelompok11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int j,nilai;
         float totalNilai,rataNilai;
         float rataTertinggi = 0;
         int kelompokTertinggi = 0;

         int i = 1;
         while (i <=6){
            System.out.println("kelompok " + i);

            totalNilai=0;
            for (j=1;j<=5;j++){
            System.out.print("nilai dari kelompok penilai " + j +": ");
            nilai = sc.nextInt();
            totalNilai += nilai;
         }
           rataNilai=totalNilai/5;
           System.out.println("kelompok" + i + ": nilai rata-rata = " + rataNilai );

           if (rataNilai > rataTertinggi){
            rataTertinggi = rataNilai;
            kelompokTertinggi = i;
           }
           i++;
         }
         
         System.out.println("\nkelompok dengan rata-rata tertinggi adalah kelompok " + kelompokTertinggi + "(" + rataTertinggi +")");
            }
         }

//Masukan:Pengguna diminta memasukkan nilai dari 5 penilai untuk setiap kelompok (total ada 6 kelompok).
//Luaran:Program menampilkan rata-rata nilai dari masing-masing kelompok berdasarkan nilai yang dimasukkan

//jawaban pertanyaan
//1.totalNilai digunakan untuk menjumlah nilai dari 5 penilai pada setiap kelompok. Nilai ini diinisialisasi (totalNilai = 0) di dalam outer loop agar setiap kelompok memulai perhitungan dari nol. Jika diletakkan di luar loop, hasilnya akan salah karena nilai dari kelompok sebelumnya ikut terakumulasi.