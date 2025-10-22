import java.util.Scanner;

public class TiketBioskop07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTiket = 0;
        double totalPendapatan = 0;
        final int HARGA_TIKET = 50000;
        String lanjut = "ya"; 

        do {
            System.out.print("Masukkan jumlah tiket yang dibeli: ");
            int jumlahTiket = sc.nextInt();

            // validasi input negatif
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid! Silakan input ulang.\n");
                sc.nextLine();                continue; 
            }

            double totalHarga = jumlahTiket * HARGA_TIKET;
            double diskon = 0;

            // menentukan diskon
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            }

            double potongan = totalHarga * diskon;
            double hargaBayar = totalHarga - potongan;

            
            totalTiket += jumlahTiket;
            totalPendapatan += hargaBayar;

            System.out.println("Diskon: " + (int)(diskon * 100) + "%");
            System.out.println("Total harga setelah diskon: Rp " + (long)hargaBayar);

            
            sc.nextLine();
            System.out.print("\nApakah masih ada pelanggan berikutnya? (ya/tidak): ");
            lanjut = sc.nextLine().trim();
            System.out.println();

        } while (lanjut.equalsIgnoreCase("ya"));

        // output akhir
        System.out.println("-- Rekapitulasi Penjualan Hari Ini --");
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total pendapatan: Rp " + (long) totalPendapatan);

        sc.close();
    }
}
