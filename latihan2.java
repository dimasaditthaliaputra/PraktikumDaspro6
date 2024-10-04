import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);

        double hargaBuku, diskon;
        int harga;

        int kamus = 5000;
        int novel = 10000;
        int bukuLain = 3000;

        System.out.print("Masukkan Jenis Buku: ");
        String jenisBuku = input06.nextLine();
        System.out.print("Masukkan Jumlah Buku: ");
        int jumlahBuku = input06.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            harga = kamus;
            hargaBuku = (1.0 - 0.1) * harga * jumlahBuku;
            if (jumlahBuku > 2) {
                hargaBuku = (1.0 - 0.02) * hargaBuku;
            }
        } else if (jenisBuku.equalsIgnoreCase("novel")) {
            harga = novel;
            hargaBuku = (1.0 - 0.03) * harga * jumlahBuku;
            if (jumlahBuku > 3) {
                hargaBuku = (1.0 - 0.02) * hargaBuku;
            } else {
                hargaBuku = (1.0 - 0.02) * hargaBuku;
            }
        } else {
            harga = bukuLain;
            if (jumlahBuku > 3) {
                hargaBuku = (1.0 - 0.05) * harga * jumlahBuku;
            } else {
                hargaBuku = harga * jumlahBuku;
            }
        }

        diskon = (harga * jumlahBuku) - hargaBuku;

        System.out.println("Total Harga Setelah Diskon: " + hargaBuku);
        System.out.println("Total diskon: " + diskon);

        input06.close();
    }
}
