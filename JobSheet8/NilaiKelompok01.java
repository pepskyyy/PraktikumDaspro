import java.util.Scanner;

public class NilaiKelompok01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai;
        double totalNilai;
        double rataNilai;

        double maxRataRata = -1;
        int kelompokTerbaik = 0;

        for (int i = 1; i <= 6; i++) {
            System.out.println("Kelompok " + i);
            totalNilai = 0;

            for (int j = 1; j <= 5; j++) {
                System.out.print("Masukkan nilai ke-" + j + ": ");
                nilai = sc.nextDouble();
                totalNilai += nilai;
            } 

            rataNilai = totalNilai / 5;
            
            if (rataNilai > maxRataRata) {
                maxRataRata = rataNilai;
                kelompokTerbaik = i;
            }

            System.out.println("Rata-rata: " + rataNilai);
            System.out.println("--------------------");
        } 

        System.out.println("\n*** KESIMPULAN ***");
        System.out.println("Kelompok dengan Rata-rata Nilai Tertinggi:");
        System.out.println("Nomor Kelompok: " + kelompokTerbaik);
        System.out.println("Rata-rata Tertinggi: " + maxRataRata);
        
        sc.close();
    }
}