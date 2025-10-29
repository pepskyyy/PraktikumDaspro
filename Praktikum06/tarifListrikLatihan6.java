import java.util.Scanner;

public class tarifListrikLatihan6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bTetap = 50000, tarifPerkwh = 0, ppn = 0.10;

        System.out.println("Opsi daya listrik(900VA, 1300VA, 2200VA, 3500VA, 5500VA): ");
        String opsiDaya = sc.nextLine();
        switch (opsiDaya) {
            case "900VA":
                tarifPerkwh = 1300;
            case "1300VA", "2200VA":
                tarifPerkwh = 1500;
            case "3500VA", "5500VA":
                tarifPerkwh = 1700;
                break;
            default:
                System.out.println("Opsi daya listrik tidak valid. Menggunakan tarif default.");
                break;
        }

        System.out.print("Masukkan daya listrik yang digunakan: ");
        double dayaListrik = sc.nextDouble();
        double bSebelumPajak = bTetap +(dayaListrik * tarifPerkwh);
        double ppnterutang = bSebelumPajak * ppn;
        double totalBiaya= bSebelumPajak + ppnterutang;
        
        System.out.println("------------------------------");
        System.out.println("Biaya tetap bulanan: Rp" + bTetap);
        System.out.println("Konsumsi daya listrik " + dayaListrik + " kwh");
        System.out.println("Biaya penggunaan: Rp" + (dayaListrik*tarifPerkwh));
        System.out.println("------------------------------");
        System.out.println("Biaya sebelum PPN: Rp" + bSebelumPajak);
        System.out.println("PPN: Rp" + ppnterutang);
        System.out.println("------------------------------");
        System.out.println("Biaya yang harus dibayar: Rp" + totalBiaya);
        sc.close();
    }
}