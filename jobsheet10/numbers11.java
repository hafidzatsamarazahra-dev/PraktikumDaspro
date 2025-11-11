package jobsheet10;

import java.util.Arrays;

public class numbers11 {
    public static void main(String[] args) {
        int [][] myNumbers = new int [3][];
        myNumbers[0] = new int [5];
        myNumbers[1] = new int [3];
        myNumbers[2] = new int [1];

        for (int i = 0;i < myNumbers.length;i++){
        System.out.println(Arrays.toString(myNumbers[i]));
    }

    for (int i = 0;i < myNumbers.length;i++){
        System.out.println("panjang baris ke-"+ (i+1) + " : " +myNumbers[i].length);
    }
    }
    
} 

//jawaban pertanyaan
//2.Arrays.toString() berfungsi untuk mengubah elemen-elemen array menjadi bentuk string (teks) agar bisa ditampilkan dengan mudah menggunakan System.out.println().
//3.Nilai default setiap elemen array bertipe int adalah 0.
//  Karena itu, saat mencetak myNumbers[i], semua elemen yang belum diisi akan menampilkan angka nol (0).
//5.int[][] myNumbers = new int[3][];
//  Artinya, jumlah baris tetap (3), tapi setiap barisnya bisa punya panjang berbeda karena tiap baris adalah array terpisah.
//  setiap baris bisa punya panjang berbeda, tetapi panjang tiap baris tetap setelah diinstansiasi.