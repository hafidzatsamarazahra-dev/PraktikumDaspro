package jobsheet11;

public class pengunjungCafe11 {
    static void daftarPengunjung(String... namaPengunjung) {
    System.out.println("Daftar nama Pengunjung:");
    for (String nama : namaPengunjung) {
        System.out.println("- " + nama);
    }
    System.out.println();
}


    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");
    }
}

//jawaban pertanyaan
// 1.Karena varargs (variable arguments) digunakan ketika jumlah argumen yang dikirim ke method tidak pasti atau bisa berubah-ubah.
// String... namaPengunjung berarti:
// Method dapat menerima 0, 1, atau banyak argumen bertipe String.
// Secara internal, varargs akan diperlakukan sebagai array String[].
// 3.Tidak bisa.
// Java hanya mengizinkan satu parameter varargs per method, dan varargs tersebut harus berada di posisi terakhir.
// 4.Tidak error
// Tidak bermasalah saat runtime
// Program tetap berjalan normal
// Karena varargs String... namaPengunjung akan menjadi array kosong (String[0]).