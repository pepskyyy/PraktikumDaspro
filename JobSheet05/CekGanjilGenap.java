import java.util.Scanner;

public class CekGanjilGenap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        int angka;

        System.out.print("Masukkan bilangan bulat: ");
        angka = sc.nextInt(); 

        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan Genap");
        } else {
            System.out.println(angka + " adalah bilangan Ganjil");
        }

        sc.close();
    }
}