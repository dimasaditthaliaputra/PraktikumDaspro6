import java.util.Scanner;

public class pemilihan2Percobaan206 {
    public static void main(String[] args) {
        Scanner input06 = new Scanner(System.in);
        int pilihan_menu;
        String member, jenisPembayaran;
        double diskon, total_bayar, harga;

        System.out.println("--------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("--------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("Masukkan angka dari menu yang dipilih = ");
        pilihan_menu = input06.nextInt();
        input06.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input06.nextLine();
        System.out.print("Jenis Pembayaran (QRIS/Non-QRIS) ? = ");
        jenisPembayaran = input06.nextLine();
        System.out.println("-------------------------------------");
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            total_bayar = harga - (harga * diskon);

            if (jenisPembayaran.equalsIgnoreCase("QRIS")) {
                total_bayar -= 1000;
                System.out.println("Potongan harga QRIS = " + total_bayar);
                System.out.println("Total bayar = " + total_bayar);
            } else if (jenisPembayaran.equalsIgnoreCase("Non-QRIS")) {
                System.out.println("Total bayar setelah diskon = " + total_bayar);
            } else {
                System.out.println("Jenis pembayaran tidak valid");
            }

        } else if (member.equalsIgnoreCase("n")) {
            if (pilihan_menu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            if (jenisPembayaran.equalsIgnoreCase("QRIS")) {
                harga -= 1000;
                System.out.println("Potongan harga QRIS = " + harga);
                System.out.println("Total bayar = " + harga);
            } else if (jenisPembayaran.equalsIgnoreCase("Non-QRIS")) {
                System.out.println("Total bayar = " + harga);
            } else {
                System.out.println("Jenis pembayaran tidak valid");
            }
        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("-------------------------------------");
    }
}