package jobsheet7;
import java.util.Scanner;
public class siakadFor11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai,tertinggi=0,terendah=100;
        int i=1;

        for (i=1; i<=10; i++){
            System.out.println("Masukkan nilai mahasiswa ke-"+i+": ");
            nilai = sc. nextDouble();
            if (nilai > tertinggi){
                tertinggi = nilai;
            }
            if (nilai < terendah){
                terendah = nilai;
            }
        }
        i++;
        System.out.println("Nilai tertinggi: "+tertinggi);
        System.out.println("Nilai terendah: "+terendah);
    }
}