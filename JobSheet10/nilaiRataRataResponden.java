import java.util.Scanner;
public class nilaiRataRataResponden {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] responden = new int[10][6];
        for (int i = 0; i < 10; i++) {
            System.out.println("Responden " + (i + 1));
            double totalPerResponden = 0;

            for (int j = 0; j < 6; j++) {
                System.out.print("Masukkan jawaban responden " + (i + 1) + " untuk pertanyaan " + (j + 1) + " (1-5): ");
                responden[i][j] = sc.nextInt();
                totalPerResponden += responden[i][j];
            }

            System.out.println("Nilai rata-rata: " + totalPerResponden / 6);
            System.out.println("======================================================");
        
        }
    sc.close();
    }
}