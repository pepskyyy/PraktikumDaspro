import java.util.Scanner;

public class JumlahKuadratTugas01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();
        sc.close();

        int totalSumKuadrat = 0; 

        for (int i = 1; i <= n; i++) {
            
            int kuadratI = i * i;
            
            totalSumKuadrat += kuadratI;

            String currentSumString = "";
            for (int j = 1; j <= i; j++) {
                int kuadratJ = j * j;
                
                currentSumString += kuadratJ;
                
                if (j < i) {
                    currentSumString += " + ";
                }
            }

            System.out.println("n=" + i + " -> jumlah kuadrat = " + currentSumString + " = " + totalSumKuadrat);
        }
}
}