import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);

        int bil1 = 28, bil2 = 54, bil3 = 15;

        if (bil1 > bil2) {
            if (bil1 > bil3) {
                System.out.println("Bilangan terbesar = " + bil1);
            } else {
                System.out.println("Bilangan terbesar = " + bil3);
            }
        } else {
            if (bil2 > bil3) {
                System.out.println("Bilangan terbesar = " + bil2);
            } else {
                System.out.println("Bilangan terbesar = " + bil3);
            }
            
        }
    }
}
