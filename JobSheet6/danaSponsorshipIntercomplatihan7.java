import java.util.Scanner;

public class danaSponsorshipIntercomplatihan7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah tim yang mengikuti Intercomp: ");
        int jumlahTim = input.nextInt();

        System.out.println("Apakah Polinema memberikan dana sponsorship? (ya/tidak): ");
        String jawaban = input.next();
        double persentaseDanaPolinema = 0.0;
        if (jawaban.equalsIgnoreCase("ya")) {
            System.out.println("Masukkan persentase dana sponsorship dari Polinema (misal 0.6 untuk 60%): ");
            persentaseDanaPolinema = input.nextDouble();
        } else {;
            System.out.println("Polinema tidak memberikan dana sponsorship.");
        }
        
        int biayaPublikasi = 300000, biayaDekorasi = 500000, biayaKonsumsiPanitiaJuri = 500000, biayaHadiah = 4000000, biayaOperasionalLain = 500000, biayaKonsumsiPesertaPerOrang = 25000, honorariumJuriPerJudul = 75000, biayaPendaftaranPerTim = 50000, jumlahPesertaPerTim = 3;

        int totalPeserta = jumlahTim * jumlahPesertaPerTim;
        int totalKonsumsiPeserta = totalPeserta * biayaKonsumsiPesertaPerOrang;
        int totalHonorariumJuri = jumlahTim * honorariumJuriPerJudul;
        int totalPendaftaran = jumlahTim * biayaPendaftaranPerTim;

        int totalAnggaran = biayaPublikasi + biayaDekorasi + biayaKonsumsiPanitiaJuri +
                            biayaHadiah + biayaOperasionalLain +
                            totalKonsumsiPeserta + totalHonorariumJuri;

        double danaPolinema = persentaseDanaPolinema * totalAnggaran;

        double danaSponsorship = totalAnggaran - danaPolinema - totalPendaftaran;

        System.out.println("Dana yang perlu dipenuhi melalui sponsorship: Rp " + (int)danaSponsorship);
    
        input.close();
    }
}