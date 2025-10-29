package jobsheet8;
import java.util.Scanner;
public class triangle11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("maukkan nilai n=");
        int n = sc.nextInt();
        int i = 0;
        while (i <= n){
            int j = 0;
            while(j <i){
                System.out.print('*');
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

//jawaban pertanyaan
//2.menambahkan System.out.println(); setelah inner loop untuk pindah baris setelah satu baris segitiga selesai.
//3.Variabel i mengatur baris (outer loop).
//  Nilainya bertambah dari 1 sampai n, menandakan jumlah baris segitiga.
//  Variabel j mengatur jumlah bintang per baris (inner loop).
//  Nilainya dimulai dari 0 setiap kali baris baru dimulai.
//  Mengapa j di-set ulang ke 0 di setiap iterasi outer loop?
//  Karena jika tidak di-reset, maka j akan terus meningkat dari iterasi sebelumnya, menyebabkan inner loop tidak berjalan sesuai harapan (tidak lagi mulai dari 0). Akibatnya, pola segitiga tidak terbentuk dengan benar (mungkin tidak mencetak apa pun setelah baris pertama)
