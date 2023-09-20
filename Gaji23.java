import java.util.Scanner;

public class Gaji23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlMasuk, jmlTdkMasuk, totGaji;
        int gaji, potGaji; 

        System.out.println("Masukan Jumlah Masuk Anda");
        jmlMasuk = input.nextInt();
        System.out.println("Masukan Jumlah Tidak Masuk Anda");
        jmlTdkMasuk = input.nextInt();
        System.out.println("Masukan Besaran Gaji Anda");
        gaji = input.nextInt(); 
        System.out.println("Masukan Besaran Potongan Gaji Anda");
        potGaji = input.nextInt(); 

        totGaji = (jmlMasuk * gaji) - (jmlTdkMasuk * potGaji);
        System.out.println("Gaji Yang Diterima Adalah: " + totGaji);
    }
}
