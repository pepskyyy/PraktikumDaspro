import java.util.Scanner;

public class rentalMobilLatihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bSewa= 300000, bSupir= 200000, bBahanBakar;

        System.out.println("Pilih jenis bahan bakar (1. Pertalite, 2. Pertamax): ");
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

        System.out.println("Jarak Tempuh:");
        int jarakTempuh = sc.nextInt();

        int totalBiaya =(lamaSewa * bSewa) + (lamaSewa * bSupir) + (jarakTempuh * bBahanBakar);

        System.out.println("Lama Sewa: " + lamaSewa + " hari");
        System.out.println("Jarak Tempuh: " + jarakTempuh + " km");
        System.out.println("Total Biaya: Rp " + totalBiaya);
        sc.close();

    }
}