package jobsheet5;
import java.util.Scanner;
public class perpus1 {
    boolean kartumahasiswa,registrasionline;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Kartu Mahasiswa : (ya/tidak) ");
        String kartumahasiswa = scanner.nextLine();
        
        System.out.print("Registrasi Online : (ya/tidak) ");
        String registrasionline = scanner.nextLine();
        
        if (kartumahasiswa.equalsIgnoreCase("ya") && registrasionline.equalsIgnoreCase("ya")) {
            System.out.println("boleh masuk perpustakaan");
        } else {
            System.out.println("ditolak masuk");
        }
        
        scanner.close();
    }
}