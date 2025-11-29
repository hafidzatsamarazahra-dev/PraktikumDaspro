package jobsheet11;

import java.lang.reflect.Parameter;

public class kafe11 {
    public static void menu(String namaPelanggan,boolean isMember, String kodePromo) {
        System.out.println("selamat datang" + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member,dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid: Anda mendapatkan diskon 50%!");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid: Anda mendapatkan diskon 30%!");
        } else {
            System.out.println("Kode promo invalid.");
        }

        System.out.println("=== MENU RESTO KAFE ===");
        System.out.println("1. kopi hitam - Rp 15.000");
        System.out.println("2. cappucino - Rp 20.000");
        System.out.println("3. latte - Rp 22.000");
        System.out.println("4. teh tarik - Rp 12.000");
        System.out.println("5. roti bakar - Rp 10.000");
        System.out.println("6. mie goreng - Rp 18.000");
        System.out.println("===========================");
        System.out.println("Silahkan pilih menu yang anda inginkan!");
    }
    public static void main(String[] args) {
        menu("Budi", true, "DISKON30");

    }
    
}

// jawaban pertanyaan percobaan 1
// 1.Fungsi tanpa parameter tidak harus bertipe void.
// Fungsi boleh saja mengembalikan nilai meskipun tidak memiliki parameter.
// 2.Ya, dapat.
// Daftar menu bisa ditampilkan langsung di dalam fungsi main tanpa memanggil fungsi lain.
// 3.Penggunaan fungsi menu() memiliki beberapa keuntungan, antara lain:
// -Struktur program lebih rapi dan terorganisir.
// Fungsi main tidak dipenuhi terlalu banyak baris kode.
// -Mengurangi duplikasi kode.
// Jika menu perlu ditampilkan lebih dari satu kali, cukup memanggil fungsi menu() tanpa menulis ulang perintah.
// -Mudah untuk pemeliharaan (maintenance).
// Jika ada perubahan pada daftar menu, cukup mengubah isi fungsi menu() tanpa perlu mencari dan mengubah seluruh bagian program.
// -Memudahkan pembacaan dan pemahaman program.
// Setiap fungsi memiliki tanggung jawab yang jelas.
// 4.-Program dimulai dari fungsi main, karena main merupakan titik awal eksekusi program Java.
// -Di dalam fungsi main, terdapat pemanggilan menu();.
// -Ketika baris tersebut dijalankan, alur program berpindah ke fungsi menu().
// -Seluruh perintah System.out.println dalam fungsi menu() dieksekusi secara berurutan sehingga daftar menu tampil di layar.
// -Setelah seluruh isi fungsi menu() selesai dijalankan, alur program kembali ke posisi pemanggilan fungsi di dalam main.
// -Karena tidak ada instruksi lain setelah pemanggilan menu(), program kemudian selesai.

// jawaban pertanyaan percobaan 2
// 1.Parameter digunakan untuk mengirimkan nilai dari luar fungsi ke dalam fungsi.
// Dengan parameter, fungsi dapat menerima data yang berbeda setiap kali dipanggil sehingga hasil eksekusinya dapat berubah sesuai input.
// 2.Karena fungsi perlu menampilkan:
// Nama pelanggan secara dinamis (tidak selalu sama), dan
// Informasi apakah pelanggan member atau bukan, yang memengaruhi output diskon.
// Tanpa parameter, fungsi hanya bisa menampilkan nilai tetap (hard-coded), sehingga tidak fleksibel.
// 3.Parameter bukan variabel biasa, tetapi keduanya berhubungan.
// Parameter adalah variabel khusus yang berada di dalam tanda kurung fungsi. Parameter menerima nilai dari luar ketika fungsi dipanggil.
// Variabel adalah tempat penyimpanan data umum di dalam blok kode.
// Jadi, parameter adalah variabel yang digunakan sebagai pintu masuk nilai ke dalam fungsi.
// 4.isMember adalah parameter bertipe boolean.
// Ketika fungsi dipanggil:
// Jika isMember == true maka blok if (isMember) dieksekusi, sehingga muncul pesan:
// "Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!"
// Jika isMember == false maka blok if dilewati, sehingga tidak ada pesan diskon yang ditampilkan.
// Dengan demikian, parameter ini menentukan apakah pesan diskon ditampilkan atau tidak.
// 5.Akan muncul error pada saat kompilasi (compile-time error), karena fungsi menu() sudah didefinisikan dengan dua parameter wajib
// Jika parameter tidak diberikan, Java tidak dapat menemukan fungsi yang cocok untuk dipanggil.
// 7.menu("Budi", true, "DISKON30");
// 8.Ya, penggunaan parameter membuat program:
// a. Lebih mudah dibaca
// Karena fungsi terlihat jelas menerima data eksternal:
// siapa pelanggan
// apakah dia member
// Sehingga orang lain yang membaca kode langsung memahami tujuan fungsi.
// b. Lebih fleksibel
// Fungsi bisa dipakai untuk banyak pelanggan berbeda tanpa edit kode.
// c. Lebih mudah dikembangkan
// Jika di masa depan ingin menambah fitur (seperti kode promo), dapat dilakukan tanpa mengubah struktur utama fungsi.
// Tanpa parameter, semua nilai akan hard-coded dan sulit digunakan ulang