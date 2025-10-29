import java.util.Scanner;

public class rentalMobilLatihan3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bSewa= 300000, bSupir= 200000, bBahanBakar= 1000;

        System.out.println("Lama Sewa:");
        int lamaSewa = sc.nextInt();
        if (lamaSewa >= 30) {
            System.out.println("Lama Sewa tidak boleh lebih dari 30 hari");
        }
        else {

        System.out.println("Jarak Tempuh:");
        int jarakTempuh = sc.nextInt();
    
        int totalBiaya =(lamaSewa * bSewa) + (lamaSewa * bSupir) + (jarakTempuh * bBahanBakar);

        System.out.println("Lama Sewa: " + lamaSewa + " hari");
        System.out.println("Jarak Tempuh: " + jarakTempuh + " km");
        System.out.println("Total Biaya: Rp " + totalBiaya);
        sc.close();

    }    
}
}