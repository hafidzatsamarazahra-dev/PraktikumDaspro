package jobsheet5;
import java.util.Scanner;

public class nestedUjianSkripsi11 {
    public static void main(String[] args) {
        String status;
        Scanner input = new Scanner(System.in);

        System.out.println("apakah mahasiswa sudah bebas kompen? (ya/tidak):");
        String bebasKompen = new Scanner(System.in).nextLine().trim();
        System.out.println("masukkan jumlah log bimbingan pembimbing 1:");
        int bimbinganP1 = new Scanner(System.in).nextInt();
        System.out.println("masukkan jumlah log bimbingan pembimbing 2:");
        int bimbinganP2 = new Scanner(System.in).nextInt();

        if (bebasKompen.equalsIgnoreCase("ya")) {
            if (bimbinganP1 >= 8 && bimbinganP1 >= 4) {
                    status = "semua syarat terpenuhi.Mahasiswa boleh mendaftarkan ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {   
                    status = "Gagal! Log bimbingan P1 kurang dari 8 kali  dan P2 kurang dari 4 kali";
            } else if (bimbinganP1 < 8) {
                    status = "Gagal! Log bimbingan P1 kurang dari 8 kali";
            } else {
                    status = "Gagal! Log bimbingan P2 kurang dari 4 kali";
            }
        } else {
            status = "Gagal! Mahasiswa masih memiliki tanggungan kompen";
    }
        System.out.println(status);
    
}
}

