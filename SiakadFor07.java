import java.util.Scanner;

public class SiakadFor07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0; // Tambahan variabel

        // perulangan for 1-10
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilai = sc.nextDouble();

            // cek nilai tertinggi dan terendah
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }

            if (nilai < terendah) {
                terendah = nilai;
            }

            // cek kelulusan
            if (nilai >= 60) {
                lulus++;
            } else {
                tidakLulus++;
            }
        }

        // output
        System.out.println("\nNilai tertinggi = " + tertinggi);
        System.out.println("Nilai terendah  = " + terendah);
        System.out.println("Jumlah mahasiswa lulus     = " + lulus);
        System.out.println("Jumlah mahasiswa tidak lulus = " + tidakLulus);

        sc.close();
    }
}
