import java.util.Scanner;

public class Lingkaran23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r;
        double luas, keliling;
        double phi = 3.14;

        System.out.println("Masukan Jari-Jari Lingkaran: ");
        r = input.nextInt();

        keliling = 2 * phi * r; 
        luas = phi * r * r; 

        System.out.println("Keliling Lingkaran: " + keliling);
        System.out.println("Luas Lingkaran: " + luas);
    }
}
