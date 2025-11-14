import java.util.Scanner;

public class JBCLatihan8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah halaman buku: ");
        int halaman = sc.nextInt();
        
        System.out.print("Masukkan jenis cover (hard/soft): ");
        String jenisCover = sc.next().toLowerCase();
        
        int biayaCetak = halaman * 200;
        
        int biayaJilid;
        int beratCover;
        if (jenisCover.equals("hard")) {
            biayaJilid = 20000;
            beratCover = 250;
        } else if (jenisCover.equals("soft")) {
            biayaJilid = 10000;
            beratCover = 100;
        } else {
            System.out.println("Jenis cover tidak valid. Menggunakan hard cover sebagai default.");
            biayaJilid = 20000;
            beratCover = 250;
        }
        
        int lembar = (halaman + 1) / 2;
        
        int beratKertas = lembar * 3;
        
        int beratKemasan = 300;
        
        int totalBeratGram = beratKertas + beratCover + beratKemasan;
        
        double beratKg = Math.ceil(totalBeratGram / 1000.0);
        
        int biayaPengiriman = (int) beratKg * 15000;
        
        int totalBiaya = biayaCetak + biayaJilid + biayaPengiriman;
        
        System.out.println("Total biaya yang harus dibayarkan: Rp " + totalBiaya);
        
        sc.close();
    }
}
