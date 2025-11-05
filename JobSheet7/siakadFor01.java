import java.util.Scanner;

public class siakadFor01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilaiTinggi = 0, nilaiRendah = 100;

        int jumlahLulus = 0, jumlahTidakLulus = 0;
        final double BATAS_LULUS = 60.0;
    
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan Nilai Praktikum Mahasiswa ke-" + i + ": ");
            double nilaiPrak = sc.nextDouble();

            if (nilaiPrak > nilaiTinggi) {
                nilaiTinggi = nilaiPrak;
            }
            if (nilaiPrak < nilaiRendah) {
                nilaiRendah = nilaiPrak;
            }
            if (nilaiPrak >= BATAS_LULUS) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }
        System.out.println("Nilai Tertinggi: " + nilaiTinggi);
        System.out.println("Nilai Terendah: " + nilaiRendah);

        System.out.println("====Hasil Kelulusan====");
        System.out.println("Jumlah Mahasiswa Lulus: " + jumlahLulus);
        System.out.println("Jumlah Mahasiswa Tidak Lulus: " + jumlahTidakLulus);

        
        sc.close();
    }
}