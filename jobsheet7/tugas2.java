package jobsheet7;
import java.util.Scanner;
public class tugas2 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis,durasi,total = 0; 

        System.out.println("masukkan jenis kendaraan");
        System.out.println("1=Mobil, 2=Motor, 0=keluar");
        
         System.out.print("\nMasukkan jenis kendaraan (0 untuk selesai): ");
         jenis = sc.nextInt(); 
        do {

            if (jenis == 0) {
                break;
            }

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt(); 

                double biayaSesi = 0; 
                
                if (durasi > 5) {
                    biayaSesi = 12500;
                } else {
                    if (jenis == 1) { 
                        biayaSesi = durasi * 3000;
                    } else if (jenis ==2){ 
                        biayaSesi = durasi * 2000;
                    } else {
                        System.out.println("keluar");
                    }
                }
                total += biayaSesi;
                System.out.println("Biaya sesi parkir: Rp " + biayaSesi);

            } else {
                System.out.println("Kode kendaraan tidak valid. Coba lagi.");
            }

        } while (true);
        
        System.out.println("Total pembayaran parkir adalah: Rp " + total);
        
    }
}