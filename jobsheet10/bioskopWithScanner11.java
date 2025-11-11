package jobsheet10;
import java.util.Scanner;
public class bioskopWithScanner11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris,kolom,i;
        String nama,next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\nMENU BIOSKOP");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            i = sc.nextInt();
            sc.nextLine();

            if (i == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Nomor kursi tidak tersedia, silakan ulangi!");
                            continue;
                        }

                        if (penonton[baris-1][kolom-1] != null) {
                            System.out.println("Kursi sudah ditempati oleh " + penonton[baris-1][kolom-1]);
                            System.out.println("Silakan pilih kursi lain.\n");
                        } else {
                            penonton[baris-1][kolom-1] = nama;
                            break;
                        }
                    }

                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }

            } else if (i == 2) {
                System.out.println("\nDAFTAR PENONTON");
                for (int r = 0; r < penonton.length; r++) {
                    System.out.print("Baris " + (r + 1) + ": ");
                    for (int c = 0; c < penonton[r].length; c++) {
                        if (penonton[r][c] == null) {
                            System.out.print("***\t");
                        } else {
                            System.out.print(penonton[r][c] + "\t");
                        }
                    }
                    System.out.println();
                }

            } else if (i == 3) {
                System.out.println("Terima kasih!");
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
    }
}

//jawaban pertanyaan
//1.Tidak harus.
//  kita bisa mengisi kursi mana pun (indeks berapa pun) selama masih dalam batas ukuran array.
//  misalnya langsung isi kursi baris ke-3 kolom ke-2 tanpa harus mengisi baris 1 dan 2 dulu.
//  Namun, jika mengakses indeks di luar batas (misal baris ke-5), program akan error (ArrayIndexOutOfBoundsException).