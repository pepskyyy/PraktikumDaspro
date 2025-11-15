import java.util.Scanner;

public class ArrayRataNilai01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah mahasiswa : "); 
        int jmlMhs = sc.nextInt();
        
        int[] nilaiMhs = new int[jmlMhs];
        
        int nilaiTertinggi = 0; 
        int nilaiTerendah = 0; 

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            
            if (i == 0) {
                nilaiTertinggi = nilaiMhs[i];
                nilaiTerendah = nilaiMhs[i];
            } else {
                if (nilaiMhs[i] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiMhs[i];
                }
                if (nilaiMhs[i] < nilaiTerendah) {
                    nilaiTerendah = nilaiMhs[i]; 
                }
            }
        }
        
        
        System.out.println("========================================");
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        System.out.println("========================================");

        sc.close();
    }
}