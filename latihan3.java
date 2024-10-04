import java.util.Scanner;

public class latihan3 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);

        String merk, kategori;
        int ukuran, harga;

        System.out.println("-------------------------");
        System.out.println("====== TOKO SEPATU ======");
        System.out.println("-------------------------");
        System.out.println("=======   MERK     ======");
        System.out.println("======= 1.Converse ======");
        System.out.println("======= 2.Sketcher ======");
        System.out.println("======= 3.Nike     ======");
        System.out.println("-------------------------");
        System.out.print("Masukkan merk : ");
        merk = input06.nextLine();
        System.out.println("------------------------------------");
        System.out.println("=======  KATEGORI dan Ukuran  ======");
        System.out.println("======= Converse              ======");
        System.out.println("======= 1.SlipON : 36-40      ======");
        System.out.println("======= 2.HightTop : 40-44    ======");
        System.out.println("------------------------------------");
        System.out.println("======= Sketchers             ======");
        System.out.println("======= 1.Woman : 36-41       ======");
        System.out.println("======= 2.Man : 41-44         ======");
        System.out.println("------------------------------------");
        System.out.println("======= Nike                  ======");
        System.out.println("======= 1.Kids : 36-40        ======");
        System.out.println("======= 2.Adult : 40-44       ======");
        System.out.println("------------------------------------");
        System.out.print("Masukkan kategori : ");
        kategori = input06.nextLine();
        System.out.print("Masukkan ukuran : ");
        ukuran = input06.nextInt();

        if (merk.equalsIgnoreCase("converse")) {
            if (kategori.equalsIgnoreCase("slipOn")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 800000;
                        System.out.println("Harga = " + harga);
                    }
                }
            } else if (kategori.equalsIgnoreCase("hightTop")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1200000;
                        System.out.println("Harga = " + harga);
                    }
                }
            } else {
                System.out.println("Kategori tidak valid");
                return;
            }
        } else if (merk.equalsIgnoreCase("skecthers")) {
            if (kategori.equalsIgnoreCase("woman")) {
                if (ukuran >= 36) {
                    if (ukuran <= 41) {
                        harga = 1000000;
                        System.out.println("Harga = " + harga);
                    }
                }
            } else if (kategori.equalsIgnoreCase("man")) {
                if (ukuran >= 41) {
                    if (ukuran <= 44) {
                        harga = 1800000;
                        System.out.println("Harga = " + harga);
                    }
                }
            } else {
                System.out.println("Kategori tidak valid");
                return;
            }
        } else if (merk.equalsIgnoreCase("nike")) {
            if (kategori.equalsIgnoreCase("kids")) {
                if (ukuran >= 36) {
                    if (ukuran <= 40) {
                        harga = 750000;
                        System.out.println("Harga = " + harga);
                    }
                }
            } else if (kategori.equalsIgnoreCase("adult")) {
                if (ukuran >= 40) {
                    if (ukuran <= 44) {
                        harga = 1500000;
                        System.out.println("Harga = " + harga);
                    }
                }
            } else {
                System.out.println("Kategori tidak valid");
                return;
            }
        }
    }
}
