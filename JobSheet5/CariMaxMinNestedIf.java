import java.util.Scanner;

public class CariMaxMinNestedIf {

    public static void main(String[] args) {
        int A, B, C;
        int Max, Min;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Program Pencari Nilai Maksimum dan Minimum (Menggunakan Nested IF)");

        System.out.print("Masukkan bilangan A: ");
        A = scanner.nextInt();
        
        System.out.print("Masukkan bilangan B: ");
        B = scanner.nextInt();
        
        System.out.print("Masukkan bilangan C: ");
        C = scanner.nextInt();
        
        if (A > B) {
            if (A > C) {
                Max = A; 
            } else {
                Max = C; 
            }
        } else {
            if (B > C) {
                Max = B; 
            } else {
                Max = C; 
            }
        }
        
        if (A < B) {
            if (A < C) {
                Min = A; 
            } else {
                Min = C; 
            }
        } else {
            if (B < C) {
                Min = B; 
            } else {
                Min = C; 
            }
        }
    
        System.out.println("\n--- Hasil ---");
        System.out.println("Bilangan Maksimum adalah: " + Max);
        System.out.println("Bilangan Minimum adalah: " + Min);
        
        scanner.close();
    }
}