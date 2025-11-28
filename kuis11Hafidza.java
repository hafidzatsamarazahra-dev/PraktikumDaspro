// Nama:Hafidza Tsamara Zahra
// NIM:254107020034
// Kelas:1G TI
// Absen:11
public class kuis11Hafidza {
    public static void main(String[] args) {
        int[][] makanan11 = {
            {6, 8, 4},   
            {10, 16, 11}, 
            {9, 14, 10},
            {12, 5, 7},   
            {5, 8, 5}     
        };

        String[] namaMakanan11 = {
            "Italian Food",
            "Korean Food",
            "Chinese Food",
            "Khas Jogja",
            "Khas Madura"
        };

        int[] hargaMakanan11 = {50000, 50000, 50000, 35000, 35000};

        int[] totalMakananTerjual11 = new int[5];

        for (int i = 0; i < makanan11.length; i++) {
            for (int j = 0; j < makanan11[i].length; j++) {
                totalMakananTerjual11[i] += makanan11[i][j];
            }
        }

        for (int i = 0; i < namaMakanan11.length; i++) {
            System.out.println("Total " + namaMakanan11[i] + " terjual: " + totalMakananTerjual11[i]);
        }

        int totalKoreanFoodTerjual11 = totalMakananTerjual11[1];
        int ratarataKoreanFoodTerjual11 = totalKoreanFoodTerjual11 / 3;
        System.out.println("Rata-rata pembelian makanan korean food adalah: " + ratarataKoreanFoodTerjual11);

        int totalPemasukanRestoranDalamSatuHari11 = 0;
        for (int i = 0; i < totalMakananTerjual11.length; i++) {
            totalPemasukanRestoranDalamSatuHari11 += totalMakananTerjual11[i] * hargaMakanan11[i];
        }
        System.out.println("Total pemasukan restoran dalam satu hari adalah: RP " + totalPemasukanRestoranDalamSatuHari11);

        String makananTerlarisDanTidakLakuDiDelivery11 = "Makanan terlaris di layanan delivery adalah: korean food \nMakanan tidak laku di layanan delivery adalah: khas jogja";
        System.out.println(makananTerlarisDanTidakLakuDiDelivery11);
    }
}
