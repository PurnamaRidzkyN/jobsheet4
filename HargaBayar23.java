import java.util.Scanner;

public class HargaBayar23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String merkBuku;
        double harga, diskon, total, bayar;
        int jumlah, halaman;

        System.out.print("Masukkan merk buku: ");
        merkBuku = input.nextLine();
        System.out.print("Masukkan jumlah halaman buku: ");
        halaman = input.nextInt();
        System.out.print("Masukkan harga barang yang dibeli: ");
        harga = input.nextDouble();
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        jumlah = input.nextInt();
        System.out.print("Masukkan besaran diskon dalam bentuk desimal: ");
        diskon = input.nextDouble();

        total = harga * jumlah * halaman/50;
        diskon = total * diskon;
        bayar = total - diskon;

        System.out.println("Merk buku: " + merkBuku);
        System.out.println("Diskon yang anda dapatkan adalah: " + diskon);
        System.out.println("Jumlah yang harus dibayar adalah: " + bayar);

    }
}
