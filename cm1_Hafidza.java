package PraktikumDaspro;

import java.util.Scanner;

public class cm1_Hafidza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nama, nim;
        double uts1, uas1, tugas1, uts2, uas2, tugas2, nilaiUts1, nilaiUas1, nilaiTugas1, nilaiUts2, nilaiUas2,
                nilaiTugas2, nilai_akhir1, nilai_akhir2, nilai_akhir;

        System.out.println("==== INPUT DATA MAHASISWA ====");
        System.out.print("Nama \t:");
        nama = sc.nextLine();
        System.out.print("NIM \t:");
        nim = sc.nextLine();

        System.out.println("\n--- MATA KULIAH 1: Algoritma dan pemrograman ---");
        System.out.print("Nilai UTS \t:");
        uts1 = sc.nextDouble();
        System.out.print("Nilai UAS \t:");
        uas1 = sc.nextDouble();
        System.out.print("Nilai Tugas \t:");
        tugas1 = sc.nextDouble();

        System.out.println("\n--- MATA KULIAH 2: Struktur data ---");
        System.out.print("Nilai UTS \t:");
        uts2 = sc.nextDouble();
        System.out.print("Nilai UAS \t:");
        uas2 = sc.nextDouble();
        System.out.print("Nilai Tugas \t:");
        tugas2 = sc.nextDouble();

        nilai_akhir1 = (uts1 * 30 / 100) + (uas1 * 40 / 100) + (tugas1 * 30 / 100);
        nilai_akhir2 = (uts2 * 30 / 100) + (uas2 * 40 / 100) + (tugas2 * 30 / 100);

        String Grade1 = "";
        String Grade2 = "";
        String Status1 = "";
        String Status2 = "";

        if (nilai_akhir1 > 80 && nilai_akhir1 <= 100) {
            Grade1 = "A";
        } else if (nilai_akhir1 > 73 && nilai_akhir1 <= 80) {
            Grade1 = "B+";
        } else if (nilai_akhir1 > 65 && nilai_akhir1 <= 73) {
            Grade1 = "B";
        } else if (nilai_akhir1 > 60 && nilai_akhir1 <= 65) {
            Grade1 = "C+";
        } else if (nilai_akhir1 > 50 && nilai_akhir1 <= 60) {
            Grade1 = "C";
        } else if (nilai_akhir1 > 39 && nilai_akhir1 <= 50) {
            Grade1 = "D";
        } else if (nilai_akhir1 >= 0 && nilai_akhir1 <= 39) {
            Grade1 = "E";
        } else {
            System.out.println("Nilai yang anda masukkan salah");
        }

        if (nilai_akhir1 >= 60) {
            Status1 = "lulus";
        } else {
            Status1 = "tidak lulus";
        }

        if (nilai_akhir2 > 80 && nilai_akhir2 <= 100) {
            Grade2 = "A";
        } else if (nilai_akhir2 > 73 && nilai_akhir2 <= 80) {
            Grade2 = "B+";
        } else if (nilai_akhir2 > 65 && nilai_akhir2 <= 73) {
            Grade2 = "B";
        } else if (nilai_akhir2 > 60 && nilai_akhir2 <= 65) {
            Grade2 = "C+";
        } else if (nilai_akhir2 > 50 && nilai_akhir2 <= 60) {
            Grade2 = "C";
        } else if (nilai_akhir2 > 39 && nilai_akhir2 <= 50) {
            Grade2 = "D";
        } else if (nilai_akhir2 >= 0 && nilai_akhir2 <= 39) {
            Grade2 = "E";
        } else {
            System.out.println("Nilai yang anda masukkan salah");
        }

        if (nilai_akhir2 >= 60) {
            Status2 = "lulus";
        } else {
            Status2 = "tidak lulus";
        }

        System.out.println("\n==== HASIL PENILAIAN AKADEMIK ====");
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.printf("%-30s %-5s %-5s %-7s %-13s %-15s %-15s\n",
                "Mata kuliah", "UTS", "UAS", "Tugas", "Nilai Akhir", "Nilai huruf", "status");

        System.out.printf(
                "----------------------------------------------------------------------------------------------");
        System.out.printf("\n%-30s %-5.0f %-5.0f %-7.0f %-13.2f %-15s %-15s\n",
                "Algoritma dan Pemrograman", uts1, uas1, tugas1, nilai_akhir1, Grade1, Status1);
        System.out.printf("%-30s %-5.0f %-5.0f %-7.0f %-13.2f %-15s %-15s\n",
                "Struktur Data", uts2, uas2, tugas2, nilai_akhir2, Grade2, Status2);

        nilai_akhir = (nilai_akhir1 + nilai_akhir2) / 2;
        System.out.printf("rata-rata nilai akhir: %.2f", nilai_akhir);

        if (nilai_akhir1 >= 60 && nilai_akhir2 >= 60) {
        if (nilai_akhir >= 70) {
            System.out.println("\nstatus semester : Lulus");
        } else if (nilai_akhir < 70) {
            System.out.println("\nstatus semester : Tidak Lulus");
        } else {
            System.out.println("\nstatus semester : Tidak Lulus");
        } }

        String reguler = "reguler";
        String profesional = "profesional";
        String fasttrack = "fast track";
        System.out.println("\nkode :reguler");
        System.out.println("kode:profesional");
        System.out.println("kode:fast track");
        System.out.println("input kode kelas mahasiswa");
        String kode = sc.next();

        switch (kode) {
            case "reguler":
                System.out.println("mahasiswa kelas reguler");
                break;
            case "profesional":
                System.out.println("mahasiswa kelas profesional");
                break;
            case "fast track":
                System.out.println("mahasiswa kelas fast track");
                break;
            default:
                System.out.println("kode kelas tidak ditemukan");
        }
        if (kode.equals(reguler)){
            if (nilai_akhir >= 60){
                System.out.println("lulus");
            } else {
                System.out.println("tidak lulus");
            }
        }else if (kode.equals(profesional)){
            if (nilai_akhir >= 65){
                System.out.println("lulus");
            } else {
                System.out.println("tidak lulus");
            }
        }else if (kode.equals(fasttrack)){
            if (nilai_akhir >= 70){
                System.out.println("lulus");
            } else {
                System.out.println("tidak lulus");
            }
        }
    }
}
