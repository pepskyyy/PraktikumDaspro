import java.util.Scanner;

public class BioskopWithScanner01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, next;
        int baris, kolom;
        String[][] penonton = new String[4][2];

        switch (penonton.length) {
        case 1:
            do {
                System.out.print("Masukkan nama: ");
                nama = sc.nextLine();
                boolean kursiTerisi;

            do {
                System.out.print("Masukkan baris (1-4): ");
                baris = sc.nextInt();
                System.out.print("Masukkan kolom (1-2): ");
                kolom = sc.nextInt();
                sc.nextLine();

                int barisIndex = baris - 1;
                int kolomIndex = kolom - 1;

                if (barisIndex >= 0 && barisIndex < penonton.length && kolomIndex >= 0 && kolomIndex < penonton[0].length) {
                    if (penonton[barisIndex][kolomIndex] == null) {
                        penonton[barisIndex][kolomIndex] = nama;
                        kursiTerisi = false;
                    } else {
                        System.out.println("!!! WARNING: Kursi [" + baris + "][" + kolom + "] sudah terisi oleh " + penonton[barisIndex][kolomIndex] + ". Silakan pilih kursi lain.");
                        kursiTerisi = true; 
                    }
                } else {
                    System.out.println("Nomor baris/kolom tidak valid.");
                    kursiTerisi = true; 
                }

        } while (kursiTerisi); 
        System.out.print("Input penonton lainnya? (y/n): ");
        next = sc.nextLine();
    } while (!next.equalsIgnoreCase("n"));
    break;
}
sc.close();
    }
}