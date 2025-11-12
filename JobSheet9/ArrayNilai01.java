import java.util.Scanner;
public class ArrayNilai01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiAkhir = new int[10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan nilai akhir mahasiswa ke-" + (i + 1) + ": ");
            nilaiAkhir[i] = sc.nextInt();
        }
        
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.println("Nilai akhir mahasiswa ke-" + (i + 1) + " adalah: " + nilaiAkhir[i]);
        }
        sc.close();
    }
}
