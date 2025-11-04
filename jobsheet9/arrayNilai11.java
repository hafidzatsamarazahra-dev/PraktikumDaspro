package jobsheet9;
import java.util.Scanner;
public class arrayNilai11 {
    public static void main(String[] args) {
        int [] nilaiAkhir = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("masukkan nilai akhir ke " +i+ ": ");
            nilaiAkhir[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("mahasiswa ke " +i+ " Lulus!");
            } else {
                System.out.println("mahasiswa ke " +i+ " Tidak Lulus!");
        }
    }
} }

//jawaban pertanyaan
//1.tidak ada perubahan
//  Karena nilaiAkhir.length otomatis menyesuaikan jumlah elemen array (10 elemen), jadi hasilnya sama seperti jika kita menulis i < 10.
//  Bedanya, dengan nilaiAkhir.length, kode menjadi lebih fleksibel — kalau nanti ukuran array diubah, loop-nya tetap akan bekerja dengan benar tanpa perlu mengganti angka 10 secara manual.
//2.melakukan perulangan selama i masih lebih kecil dari jumlah elemen array
