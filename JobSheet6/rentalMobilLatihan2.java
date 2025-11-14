import java.util.Scanner;

public class rentalMobilLatihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Deklarasi beberapa variabel
        int bSewa= 300000, bSupir= 200000, bBahanBakar= 1000;

        //Meminta input dari pengguna
        System.out.println("Lama Sewa:");
        int lamaSewa = sc.nextInt();
        
        System.out.println("Jarak Tempuh:");
        int jarakTempuh = sc.nextInt();
    
        //Proses penghitungan total biaya
        int totalBiaya =(lamaSewa * bSewa) + (lamaSewa * bSupir) + (jarakTempuh * bBahanBakar);
        if (totalBiaya > 2000000) {
            totalBiaya = totalBiaya - (totalBiaya * 5 / 100);
            System.out.println("Anda mendapatkan diskon 5% karena total biaya lebih dari Rp 2.000.000");
        }
        else {
            totalBiaya = totalBiaya;
        }

        //Menampilkan hasil
        System.out.println("Lama Sewa: " + lamaSewa + " hari");
        System.out.println("Jarak Tempuh: " + jarakTempuh + " km");
        System.out.println("Total Biaya: Rp " + totalBiaya);
        sc.close();

    }
}
