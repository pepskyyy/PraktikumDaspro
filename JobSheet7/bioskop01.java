import java.util.Scanner;

public class bioskop01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000, tiketTerjual = 0, hargaTotal = 0 , jumlahTiket = 0, totalPendapatan = 0;
        double diskon = 0.0;
        do{
            System.out.print("Butuh berapa tiket?: ");
            jumlahTiket = sc.nextInt();
            
            
            if(jumlahTiket > 10){
                System.out.println("anda mendapatkan diskon 15%");
                diskon = 0.15;
            } else if(jumlahTiket > 4){
                System.out.println("anda mendapatkan diskon 10%");
                diskon = 0.10;
            } else {
                diskon = 0.0;
            } if(jumlahTiket <= 0){
                System.out.println("Jumlah tiket tidak valid.");
                return;
            }
            double hargaSebelumDiskon = jumlahTiket * hargaTiket;
            double hargaSetelahDiskon = hargaSebelumDiskon * (1 - diskon);
            
            tiketTerjual += jumlahTiket;
            hargaTotal += hargaSetelahDiskon;
            
            System.out.println("=====Program tiket bioskop=======");
            System.out.println("Jumlah tiket yang dibeli: " + jumlahTiket);
            System.out.println("Harga total tiket: Rp " + hargaSetelahDiskon);
            System.out.println("=================================");
            System.out.println("Terima kasih telah membeli tiket di bioskop kami!");

            totalPendapatan = hargaTotal;
            System.out.println("Total tiket terjual: " + tiketTerjual);
            System.out.println("Total pendapatan: Rp " + totalPendapatan);
            System.out.println("-------------------------------");
            
            sc.close();
        } while(true);
       
    }
}