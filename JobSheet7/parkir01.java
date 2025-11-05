import java.util.Scanner;

public class parkir01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tarif1 = 3000, tarif2= 2000, totalTarif = 0;

        do{
        System.out.print("Masukkan lama parkir (dalam jam): ");
        int lamaParkir = sc.nextInt();

        System.out.print("Masukkan jenis kendaraan (1. Mobil, 2. Motor, 0. Keluar): ");
        int jenisKendaraan = sc.nextInt();

        if (jenisKendaraan == 1) {
            if (lamaParkir <= 2) {
                totalTarif = tarif1;
            } else {
                totalTarif = tarif1 + (lamaParkir - 2) * tarif2;
            } if (lamaParkir >= 5) {
                System.out.println("Durasi parkir anda lebih dari 5 jam dikenakan tarif: Rp: 12.500");
                totalTarif = 12500;
            }
        } else if (jenisKendaraan == 2) {
            if (lamaParkir <= 3) {
                totalTarif = tarif2;
            } else {
                totalTarif = tarif2 + (lamaParkir - 3) * (tarif2 / 2);
            } if(lamaParkir >= 5) {
                System.out.println("Durasi parkir anda lebih dari 5 jam dikenakan tarif: Rp: 12.500");
                totalTarif = 12500;
            }
        } else if (jenisKendaraan == 0) {
            return;
        } else {
            System.out.println("Jenis kendaraan tidak valid.");
            break;
        }
        
        System.out.println("================================");
        System.out.println("Total tarif parkir anda: Rp: " + totalTarif);
        System.out.println("Durasi parkir anda: " + lamaParkir + " jam");
        System.out.println("================================");
        System.out.println("Terima kasih telah menggunakan layanan parkir kami!");
        System.out.println("-------------------------------");
        
        sc.close();
    } while(true);

    }
}
