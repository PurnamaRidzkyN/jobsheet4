import java.util.Scanner;
public class Lingkaran23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System. in);
        
        int r;
        double luas, keliling;

        System.out.println("Masukan Jari-Jari Lingkaran: ");
        r = input.nextInt();

        keliling = 2*3.14*r;
        luas = 3.14*r*r;

        System.out.println(keliling);
        System.out.println(luas);

        

    }
}