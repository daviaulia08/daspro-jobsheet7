import java.util.Scanner;

public class tugasparkir08 {
    public static void main (String[] args) {

        Scanner sc = new Scanner (System.in);

        int jenis; 
        int durasi;
        double total = 0;

        do {
            System.out.println("1.Mobil");
            System.out.println("2.Motor");
            System.out.println("3.Kosong");
            System.out.print("Masukkan jenis kendaraan : ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }

            if (jenis == 1 || jenis == 2) {
               System.out.print("Masukkan durasi parkir : ");
               durasi = sc.nextInt();

               if (durasi > 5) {
                total += 12500;
               } 
               if (jenis == 1) {
                total += durasi * 3000;
               }
               if (jenis == 2) {
                total += durasi * 2000;
               }

            System.out.println("Total yang harus dibayar: Rp " + total);

            sc.nextLine();       

        }

        } while (true);

        System.out.println("Semua transaksi selesai.");
        System.out.println("Total pendapatan: Rp " + total);
        
    }
}