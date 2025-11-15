import java.util.Scanner;

public class SearchNilai01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya nilai yang akan diinput: "); 
        int jmlElemen = sc.nextInt();
        int[] arrNilai = new int[jmlElemen];
        
        for (int i = 0; i < jmlElemen; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            arrNilai[i] = sc.nextInt();
        }
        
        System.out.print("Masukkan nilai yang ingin dicari (key): "); 
        int key = sc.nextInt();
        
        int hasilIndeks = -1;
        
        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasilIndeks = i;
                break;
            }
        }
        
        if (hasilIndeks != -1) {
            System.out.println("=====================================");
            System.out.println("Nilai " + key + " ditemukan!");
            System.out.println("Nilai tersebut berada di indeks ke-" + hasilIndeks); 
            System.out.println("Merupakan nilai mahasiswa ke-" + (hasilIndeks + 1));
            System.out.println("=====================================");
        } else {
             System.out.println("=====================================");
             System.out.println("Nilai tidak ditemukan.");
             System.out.println("=====================================");
        }
        
        sc.close();
    }
}