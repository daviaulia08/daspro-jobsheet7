import java.util.Scanner;

public class tugasbioskop08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double harga = 50000;
        double biaya;
        double jumlah;
        double totalJumlah = 0;
        double totalHarga = 0;
        String nama;

        do {
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            nama = sc.nextLine();

            if (nama.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            System.out.print("Masukkan jumlah tiket: ");
            jumlah = sc.nextInt();

            if (jumlah < 0) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid.");
                sc.nextLine(); 
                continue;
            }

            if (jumlah > 0 && jumlah <= 4) {
                biaya = harga * jumlah;
            } else if (jumlah > 4 && jumlah <= 10) {
                biaya = (harga - (harga * 0.10)) * jumlah;
            } else {
                biaya = (harga - (harga * 0.15)) * jumlah;
            }

            totalHarga += biaya;
            totalJumlah += jumlah;
            System.out.println("Total yang harus dibayar: Rp " + biaya);

            sc.nextLine();  

        } while (true);

        System.out.println("Semua transaksi selesai.");
        System.out.println("Total pendapatan: Rp " + totalHarga);
        System.out.println("Total tiket terjual: " + (int)totalJumlah);
    }
}
