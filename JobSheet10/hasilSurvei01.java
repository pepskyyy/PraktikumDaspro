import java.util.Scanner;

public class hasilSurvei01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] responden = new int[10][6];
        
        for (int i = 0; i < 9; i++){
            System.out.println("Responden " + (i+1));
            for (int j = 0; j < 5; j++){
                System.out.print("Masukkan jawaban responden " + (i+1) + " untuk pertanyaan" + (j+1) + "(1-5): ");
                responden[i][j] = sc.nextInt();
            }
            System.out.println("======================================================");
        }
        sc.close();
    }
}
