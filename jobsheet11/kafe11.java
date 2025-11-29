package jobsheet11;

import java.util.Scanner;

public class kafe11 {

    public static void menu(String namaPelanggan, boolean isMember, String kodePromo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selamat datang " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("=== MENU RESTO KAFE ===");
        System.out.println("1. Kopi Hitam   - Rp 15.000");
        System.out.println("2. Cappucino    - Rp 20.000");
        System.out.println("3. Latte        - Rp 22.000");
        System.out.println("4. Teh Tarik    - Rp 12.000");
        System.out.println("5. Roti Bakar   - Rp 10.000");
        System.out.println("6. Mie Goreng   - Rp 18.000");
        System.out.println("===========================");

        System.out.print("Berapa jenis menu yang ingin Anda pesan? ");
        int jumlahJenisMenu = sc.nextInt();

        int totalKeseluruhan = 0;

        for (int i = 1; i <= jumlahJenisMenu; i++) {
            System.out.println("\nPesanan ke-" + i);
            System.out.print("Masukkan nomor menu (1–6): ");
            int pilihanMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item: ");
            int jumlahItem = sc.nextInt();

            int totalHarga = hitungTotalHargaNoPresensi(pilihanMenu, jumlahItem, kodePromo);

            System.out.println("Subtotal pesanan ini: Rp " + totalHarga);
            totalKeseluruhan += totalHarga;
        }

        System.out.println("\n=== TOTAL KESELURUHAN ===");
        System.out.println("Total yang harus dibayar: Rp " + totalKeseluruhan);
    }

    public static void main(String[] args) {
        menu("Budi", true, "DISKON30");
    }

    public static int hitungTotalHargaNoPresensi(int pilihanMenu, int jumlahPesanan, String kodePromo) {

        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int totalHarga = hargaItems[pilihanMenu - 1] * jumlahPesanan;

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 50%");
            totalHarga -= totalHarga * 50 / 100;
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid! Anda mendapatkan diskon 30%");
            totalHarga -= totalHarga * 30 / 100;
        } else {
            System.out.println("Kode promo invalid. Tidak ada diskon berlaku.");
        }

        return totalHarga;
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

// jawaban pertanyaan percobaan 3
// 1.Fungsi membutuhkan nilai kembalian (return value) jika:
// Fungsi tersebut harus menghasilkan sebuah nilai yang akan dipakai kembali oleh bagian program lain.
// Contoh dari program kafe (Percobaan 3):
// public static int hitungTotalHarga(int pilihanMenu, int banyakItem)
// public static int hitungTotalHarga(int pilihanMenu, int banyakItem)
// Fungsi tidak perlu mengembalikan nilai (void) jika:
// Fungsi hanya melakukan aksi/tugas, seperti menampilkan output, tanpa harus memberikan nilai kembali.
// Contoh dari program kafe (Percobaan 3):
// public static void menu(String namaPelanggan, boolean isMember, String kodePromo)
// Fungsi ini hanya menampilkan menu, meminta input, dan menampilkan hasil. Tidak perlu mengembalikan nilai apa pun.
// 2.Misalkan fungsi tersebut bentuknya seperti:
// public static int hitungTotalHargaNoPresensi(int pilihanMenu, int jumlahPesanan)
// Tipe data nilai kembalian: int
// Karena yang dihitung adalah total harga dalam bentuk bilangan bulat.
// Dua parameter yang digunakan:
// int pilihanMenu
// Menentukan menu mana yang dipilih (1–6)
// int jumlahPesanan
// Menentukan berapa banyak item yang dipesan.
// Arti parameter dalam konteks program kafe:
// pilihanMenu dipakai sebagai indeks untuk mengambil harga dari array harga.
// jumlahPesanan menentukan total harga = harga per item * jumlah.
