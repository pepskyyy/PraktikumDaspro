import java.util.Scanner;
public class rentalMobilLatihan4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bSewa= 300000, bSupir= 200000, bBahanBakar= 1000;

        System.out.println("Masukkan tipe bahan bakar (1. Pertalite, 2. Pertamax): ");
        switch (sc.next()) {
            case "Pertalite":
                bBahanBakar = 1000;
                break;
            case "Pertamax":
                bBahanBakar = 1300;
                break;
            default:
                System.out.println("Pilihan tidak valid. Menggunakan Pertalite sebagai default.");
                bBahanBakar = 1000;
        }

        System.out.println("Lama Sewa:");
        int lamaSewa = sc.nextInt();
        if (lamaSewa >= 30 ) {
            System.out.println("Lama Sewa tidak boleh lebih dari 30 hari");
        }
        else {

        System.out.println("Jarak Tempuh:");
        int jarakTempuh = sc.nextInt();
    
        int totalBiaya =(lamaSewa * bSewa) + (lamaSewa * bSupir) + (jarakTempuh * bBahanBakar);
        if (totalBiaya > 2000000) {
            totalBiaya = totalBiaya - (totalBiaya * 5 / 100);
            System.out.println("Anda mendapatkan diskon 5% karena total biaya lebih dari Rp 2.000.000");
        }
        else {
            totalBiaya = totalBiaya;
        }

        System.out.println("Lama Sewa: " + lamaSewa + " hari");
        System.out.println("Jarak Tempuh: " + jarakTempuh + " km");
        System.out.println("Total Biaya: Rp " + totalBiaya);
        sc.close();

    }    
}
}