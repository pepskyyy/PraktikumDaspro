import java.util.Scanner;

public class CetakKRS01{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("--- Cetak KRS Siakad ---");
    System.out.print("Apakah UKT sudah lunas? (true/false): ");
    boolean uktLunas = sc.nextBoolean();

    if (uktLunas) {
        System.out.println("Pembayaran UKT terverifikasi.");
        System.out.println("Silakan cetak KRS Anda dan minta tanda tangan DPA.");
        } else{
        System.out.println("Pembayaran UKT belum terverifikasi.");
        System.out.println("Silakan lunasi UKT terlebih dahulu.");
        }

        sc.close();
    }
}