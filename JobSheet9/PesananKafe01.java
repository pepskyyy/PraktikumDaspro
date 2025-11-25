import java.util.Scanner;

public class PesananKafe01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] daftarMenu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", 
                               "Kentang Goreng", "Teh Tarik", "Cappucino", 
                               "Chocolate Ice"};
        double[] daftarHarga = {20000, 22000, 15000, 17000, 13000, 18000, 
                                20000}; 
        
        int[] daftarPesanan = new int[daftarMenu.length]; 

        double totalHarga = 0; 
        int jumlahPesanan; 
        
        System.out.println("==========================================");
        System.out.println("        Sistem Pemesanan Kafe");
        System.out.println("==========================================");
        
        do {
            System.out.print("Masukkan jumlah pesanan (ketik 0 untuk keluar): "); 
            if (sc.hasNextInt()) {
                jumlahPesanan = sc.nextInt();
                sc.nextLine(); 
            } else {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                sc.nextLine(); 
                jumlahPesanan = -1; 
                continue;
            }

            if (jumlahPesanan == 0) { 
                break; 
            }
            
            if (jumlahPesanan < 1) {
                System.out.println("Jumlah pesanan minimal adalah 1.");
                continue;
            }

            for (int j = 0; j < jumlahPesanan; j++) { 
                System.out.println("------------------------------------------");
                System.out.print("Masukkan menu " + (j + 1) + ": "); 
                String namaMenu = sc.nextLine().trim(); 
                
                int indeksMenu = -1;
                
                for (int i = 0; i < daftarMenu.length; i++) {
                    if (namaMenu.equalsIgnoreCase(daftarMenu[i])) { 
                        indeksMenu = i; 
                        break; 
                    }
                }
                
                if (indeksMenu != -1) {
                    System.out.print("Masukkan jumlah: "); 
                    int jumlahItem; 

                    if (sc.hasNextInt()) {
                        jumlahItem = sc.nextInt();
                        sc.nextLine(); 
                    } else {
                        System.out.println("Input jumlah item tidak valid. Pesanan ini diabaikan.");
                        sc.nextLine(); 
                        j--; 
                        continue;
                    }
                    
                    if (jumlahItem > 0) {
                        daftarPesanan[indeksMenu] += jumlahItem; 
                    } else {
                        System.out.println("Jumlah item harus lebih dari 0. Pesanan ini diabaikan.");
                        j--; 
                    }
                   
                } else {
                    System.out.println("Menu '" + namaMenu + "' tidak tersedia. Silakan masukkan menu yang benar.");
                    j--; 
                }
            }
            
            totalHarga = 0; 
            for (int i = 0; i < daftarPesanan.length; i++) {
                if (daftarPesanan[i] > 0) {
                    totalHarga += daftarPesanan[i] * daftarHarga[i]; 
                }
            }
            
            System.out.println("==========================================");
            System.out.println("Total: " + (int)totalHarga); 
            System.out.println("==========================================");

        } while (true); 

        System.out.println("Terima kasih atas pesanannya!");
        sc.close();
    }
}