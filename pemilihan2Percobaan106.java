import java.util.Scanner;

public class pemilihan2Percobaan106 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);
        int tahun;

        System.out.print("Masukkan Tahun : ");
        tahun = input06.nextInt();

        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat");
            } else {
                System.out.println("Bukan tahun kabisat");
            }
        } else {
            System.out.println("Bukan tahun kabisat");
        }
    }
}
