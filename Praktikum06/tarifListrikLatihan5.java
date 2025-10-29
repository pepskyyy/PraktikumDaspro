import java.util.Scanner;

public class tarifListrikLatihan5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double bTetap = 50000, tarifPerkwh = 0, ppn = 0.10;

        System.out.println("Opsi daya listrik(900 VA, 1300 VA, 2200 VA, 3500 VA, 5500 VA): ");
        String opsiDaya = sc.nextLine();
        if (opsiDaya.equalsIgnoreCase("900va")) {
            tarifPerkwh = 1300;
        }
        else if (opsiDaya.equalsIgnoreCase("1300va")|| opsiDaya.equalsIgnoreCase("2200va")) {
            tarifPerkwh = 1500;
        }
        else if (opsiDaya.equalsIgnoreCase("3500va")|| opsiDaya.equalsIgnoreCase("5500va")) {
            tarifPerkwh = 1700;
        }
        else {
            System.out.println("Opsi daya listrik tidak valid. Menggunakan tarif default.");
            return;
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
