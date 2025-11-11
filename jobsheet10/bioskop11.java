package jobsheet10;

public class bioskop11 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];
        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana";
        
        for (int i = 0;i < penonton.length;i++){
            System.out.println("penonton pada baris ke-" + (i+1) + ": " + String.join(",", penonton[i]));
        }

        System.out.println(penonton.length);

        for(String[] barisPenonton : penonton){
            System.out.println("panjang baris: " + barisPenonton.length);
        }

        System.out.println("penonton pada baris ke-3: ");

        for (String i : penonton[2]) {
            System.out.println(i);
        }
    } }
    

//jawaban pertanyaan
//1.Tidak harus.
//  elemen array dapat diisi secara acak sesuai dengan indeks yang ingin diisi.
//  selama indeks tersebut valid (tidak melebihi ukuran array).
//2.Karena tidak semua elemen array diisi.
//  penonton[3][1] tidak diisi, sehingga nilainya tetap null (nilai default dari elemen String yang belum diinisialisasi).
//4.penonton.length
//  Menunjukkan jumlah baris
//  penonton[0].length
//  Menunjukkan jumlah kolom
//  ya, semua memiliki nilai yang sama, yaitu 2.
//  Alasannya:
//  Karena array nya ukuran tetap 2 kolom untuk setiap baris.
//5.System.out.println(penonton.length);
//  Menampilkan jumlah baris dalam array penonton yaitu 4
//  Perulangan for
//  Mengecek setiap baris (dari indeks 0 sampai 3) dan mencetak berapa panjang kolomnya (penonton[i].length)
//6.for (String[] barisPenonton : penonton)
//  Ini adalah enhanced for loop, digunakan untuk mengambil setiap baris dari array dua dimensi penonton.
//  Pada setiap iterasi, variabel barisPenonton merepresentasikan satu baris (yaitu array 1 dimensi bertipe String[]).
//  Jadi, barisPenonton.length menunjukkan jumlah kolom dalam baris tersebut.
//  System.out.println("Panjang baris: " + barisPenonton.length);
//  Menampilkan panjang (jumlah kolom) untuk setiap baris.
//7.Kode tersebut menampilkan isi array pada baris ke-3 (indeks ke-2).
//  Loop digunakan untuk menelusuri setiap elemen dalam baris tersebut.
//  Hasilnya menampilkan dua nama: Eka dan Farhan.
//8.Kode for (String i : penonton[2]) adalah cara yang lebih sederhana dan rapi dibandingkan for (int i = 0; i < penonton[2].length; i++).
//  Fungsinya sama, yaitu menampilkan seluruh nama pada baris ke-3.
//  Hasil akhirnya tetap sama
//9.for (int i = 0; i < penonton.length; i++)
//  Melakukan perulangan sebanyak jumlah baris pada array penonton.
//  Karena penonton dideklarasikan sebagai new String[4][2];, maka penonton.length = 4.
//  Artinya, loop berjalan dari i = 0 sampai i = 3.
//  String.join(",", penonton[i])
//  Menggabungkan semua elemen di dalam baris ke-i menjadi satu string, dengan pemisah berupa koma (,).
//  System.out.println("Penonton pada baris ke-" + (i + 1) + ": " + ... );
//  Menampilkan hasil penggabungan tersebut ke layar dengan keterangan baris keberapa.
//10.Kelebihan foreach: lebih simpel, mudah dibaca, dan aman dari error indeks.
//   Kekurangan: tidak bisa akses indeks langsung dan tidak bisa ubah elemen tertentu.
//11.Indeks baris maksimal = 3 (karena jumlah baris 4 ,jadi 0–3).
//12.Indeks kolom maksimal = 1 (karena tiap baris punya 2 kolom,jadi 0–1).
//13.String.join() berfungsi menggabungkan elemen string dalam array dengan pemisah tertentu (misal koma).