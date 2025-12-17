import java.util.Scanner;

public class PendaftaranBeasiswa01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahPendaftar = 0;   
        String[] namaPendaftar = new String[50];
        String[] nimPendaftar = new String[50];
        double[] ipkPendaftar = new double[50];
        String[] jenisBeasiswaPendaftar = new String[50];
        int[] penghasilanOrtuPendaftar = new int[50];
        int pilihan;
        
        do {
        System.out.println("\n=== Sistem Pendaftaran Beasiswa ===");
        System.out.println("1. Tambah Data Pendaftar Beasiswa");
        System.out.println("2. Tampilkan Semua Pendaftar");
        System.out.println("3. Cari Pendaftar Berdasarkan Jenis Beasiswa");
        System.out.println("4. Hitung Rata-rata IPK per Jenis Beasiswa");
        System.out.println("5. Keluar");
        System.out.print("Pilih menu (1-5): ");
        pilihan = sc.nextInt();
        sc.nextLine();
        
        switch (pilihan) {
            case 1:
                if (jumlahPendaftar > 50) {
                    System.out.println("Maaf, kuota pendaftar sudah penuh.");
                    break;
                    } else {
                    System.out.print("Nama: ");
                    namaPendaftar[jumlahPendaftar] = sc.nextLine();
                    System.out.print("NIM: ");
                    nimPendaftar[jumlahPendaftar] = sc.nextLine();
                    System.out.print("IPK Terakhir: ");
                    ipkPendaftar[jumlahPendaftar] = sc.nextDouble();
                    sc.nextLine();

                    String inputJenisBeasiswa;
                    boolean jenisValid;
                    do{
                        System.out.print("Jenis Beasiswa (Reguler/Unggulan/Riset): ");
                        inputJenisBeasiswa = sc.nextLine();
                        jenisValid = inputJenisBeasiswa.equalsIgnoreCase("Reguler") ||
                                     inputJenisBeasiswa.equalsIgnoreCase("Unggulan") ||
                                     inputJenisBeasiswa.equalsIgnoreCase("Riset");
                        if (!jenisValid) {
                            System.out.println("Input jenis beasiswa tidak valid. Hanya boleh Reguler, Unggulan, atau Riset.");
                        }
                    } while (!jenisValid);
                    jenisBeasiswaPendaftar[jumlahPendaftar] = inputJenisBeasiswa;

                    System.out.print("Penghasilan orang tua (maksimal 2000000): ");
                    penghasilanOrtuPendaftar[jumlahPendaftar] = sc.nextInt();
                    sc.nextLine();

                    if (penghasilanOrtuPendaftar[jumlahPendaftar] >= 2000000) {
                        System.out.println("Maaf, penghasilan orang tua melebihi batas maksimal.");
                        break;
                    } else {
                        System.out.println("\nPendaftar berhasil disimpan. " + ++jumlahPendaftar);
                    }
                } 
                break;

            case 2: 
                System.out.println("=== Jumlah Pendaftar Beasiswa ===");
                if(jumlahPendaftar == 0) {
                    System.out.println("Belum ada pendaftar.");
                    break;
                } else {
                System.out.println("\n--- Data Seluruh Pendaftar Beasiswa ---");
                        System.out.printf("| %-4s | %-20s | %-10s | %-4s | %-10s | %-15s |\n",
                                          "No", "Nama", "NIM", "IPK", "Jenis", "Penghasilan");
                        System.out.println("--------------------------------------------------------------------------------");
                        for (int i = 0; i < jumlahPendaftar; i++) {
                            System.out.printf("| %-4d | %-20s | %-10s | %-4.2f | %-10s | %-15d |\n",
                                              (i + 1), namaPendaftar[i], nimPendaftar[i], ipkPendaftar[i], jenisBeasiswaPendaftar[i], penghasilanOrtuPendaftar[i]);
                        }
                        System.out.println("--------------------------------------------------------------------------------\n");
                    }
                break;
            case 3:
                if (jumlahPendaftar == 0) {
                    System.out.println("Belum ada pendaftar.");
                    break;
                } 
                
                String cariJenis;
                boolean cariJenisValid;
                do {
                    System.out.print("Cari berdasarkan Jenis Beasiswa (Reguler/Unggulan/Riset): ");
                    cariJenis = sc.nextLine();
                    cariJenisValid = cariJenis.equalsIgnoreCase("Reguler") ||
                                    cariJenis.equalsIgnoreCase("Unggulan") ||
                                    cariJenis.equalsIgnoreCase("Riset");
                    if (!cariJenisValid) {
                        System.out.println("Input jenis beasiswa tidak valid. Hanya boleh Reguler, Unggulan, atau Riset.");
                    }
                } while (!cariJenisValid) ;
                        System.out.println("\n--- Pendaftar Jenis Beasiswa " + cariJenis + " ---");
                    boolean ditemukan = false;
                    System.out.printf("| %-4s | %-20s | %-10s | %-4s | %-10s | %-15s |\n",
                                      "No", "Nama", "NIM", "IPK", "Jenis", "Penghasilan");
                    System.out.println("--------------------------------------------------------------------------------");
                    
                    int noUrut = 1;
                    for (int i = 0; i < jumlahPendaftar; i++) {
                        if (jenisBeasiswaPendaftar[i].equalsIgnoreCase(cariJenis)) {
                            System.out.printf("| %-4d | %-20s | %-10s | %-4.2f | %-10s | %-15d |\n",
                                              noUrut++, namaPendaftar[i], nimPendaftar[i], ipkPendaftar[i], jenisBeasiswaPendaftar[i], penghasilanOrtuPendaftar[i]);
                            ditemukan = true;
                        }
                    }
                    System.out.println("--------------------------------------------------------------------------------\n");

                if (!ditemukan) {
                        System.out.println("Tidak ada pendaftar untuk jenis beasiswa " + cariJenis + ".");
                    }
                break;
        
            case 4:
                String[] jenisBeasiswa = {"Reguler", "Unggulan", "Riset"};
                double totalIPK;
                int hitungPendaftar;

                System.out.println("\n--- Rata-rata IPK per Jenis Beasiswa ---");

                for (String jb : jenisBeasiswa) {
                    totalIPK = 0;
                    hitungPendaftar = 0;
                    for (int i = 0; i< jumlahPendaftar; i++) {
                        if (jenisBeasiswa[i].equalsIgnoreCase(jb)) {
                            totalIPK += ipkPendaftar[i];
                            hitungPendaftar++;
                        }
                    }

                    System.out.println(jb);
                    if (hitungPendaftar > 0) {
                        double rataRata = totalIPK / hitungPendaftar;
                        System.out.printf("Rata-rata IPK: %.2f\n\n", rataRata);
                    } else {
                        System.out.println("Tidak ada pendaftar.");
                    }
                    }
                    System.out.println();
                    break;
                

            case 5:
                System.out.println("Terima kasih, program selesai.");
                break;
                        
                default:
                System.out.println("Pilihan tidak valid. Silakan pilih 1 sampai 5.");
                break;
                            
            }
        } while (pilihan != 5);

        sc.close();
    }
}