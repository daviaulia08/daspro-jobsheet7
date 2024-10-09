import java.util.Scanner;
public class kafedowhile08 {
    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        double hargaKopi = 12000;
        double hargaTeh = 7000;
        double hargaRoti = 20000;
        double totalHarga;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Traksaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " + totalHarga);
            sc.nextLine();

        } while (true);

        System.out.println("Semua traksaksi selesai.");
    }
}