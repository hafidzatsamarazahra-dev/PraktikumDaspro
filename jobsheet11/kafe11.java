package jobsheet11;

public class kafe11 {
    public static void menu(String namaPelanggan,boolean isMember){
        System.out.println("selamat datang" + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member,dapatkan diskon 10% untuk setiap pembelian!");
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
        menu("andi", true);
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