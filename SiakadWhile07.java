import java.util.Scanner;

public class SiakadWhile07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 1; 
        int jumlahMhs;
        double nilai;

        
        System.out.print("Masukkan jumlah mahasiswa: ");
        jumlahMhs = sc.nextInt();

        // perulangan 
        while (i <= jumlahMhs) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + " : ");
            nilai = sc.nextDouble();

            // pengecekan validitas nilai
            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai Tidak Valid\n");
                continue; 
            }

            // menentukan kategori 
            if (nilai > 80 && nilai <= 100) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah A");
                System.out.println("Bagus, pertahankan nilainya!\n"); 
            } else if (nilai > 73 && nilai <= 80) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah B+\n");
            } else if (nilai > 65 && nilai <= 73) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah B\n");
            } else if (nilai > 60 && nilai <= 65) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah C+\n");
            } else if (nilai > 50 && nilai <= 60) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah C\n");
            } else if (nilai > 39 && nilai <= 50) {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah D\n");
            } else {
                System.out.println("Nilai mahasiswa ke-" + i + " adalah E\n");
            }

            i++; 
        }
                sc.close();
    }
}