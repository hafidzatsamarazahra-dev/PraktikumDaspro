package jobsheet9;
import java.util.Scanner;
public class arrayBilangan11 {
    public static void main(String[] args) {
        int bil[] = {5, 13, -7, 17};

        for (int i = 0; i < 4; i++) {
            System.out.println(bil[i]);
        }
    }
}

//jawaban pertanyaan
//1.5.0 dan 7.5 bertipe double, bukan int.
//  Nilai 12867 dan 2000000 sebenarnya masih dalam jangkauan tipe int, jadi aman.
//  Tetapi karena ada nilai bertipe double, program tidak bisa dicompile
//3.Perulangan dimulai dari i = 0.
//  Berhenti ketika i sudah mencapai 4 (karena kondisi i < 4 sudah tidak terpenuhi).
//  Di setiap iterasi, bil[i] dicetak ke layar.
//  Jadi, program menampilkan seluruh isi array dari indeks 0 sampai 3.
//4.ada tulisan eror setelah output angka 5,13,-7,17
//  Karena array bil memiliki 4 elemen (indeks 0–3).
//  Saat i bernilai 4, program mencoba mengakses bil[4],
//  padahal indeks 4 tidak ada dalam array (melebihi batas).
//  Akibatnya, program berhenti dengan error “ArrayIndexOutOfBoundsException”.