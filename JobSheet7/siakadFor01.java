import java.util.Scanner;

public class siakadFor01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilaiTinggi = 0, nilaiRendah = 100;

        
        for (int i = 1; i <= 10; i++) {
            if (i <= 10) {
                System.out.print("Masukkan Nilai Praktikum Dasar Pemrograman ke-" + i + ": ");
                int nilaiPrak = sc.nextInt();

                if (nilaiPrak > nilaiTinggi) {
                    nilaiTinggi = nilaiPrak;
                }
                if (nilaiPrak < nilaiRendah) {
                    nilaiRendah = nilaiPrak;
                }
                System.out.println("Nilai Tertinggi: " + nilaiTinggi);
                System.out.println("Nilai Terendah: " + nilaiRendah);
            }
        }
        
        sc.close();
    }
}