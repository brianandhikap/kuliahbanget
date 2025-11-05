import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Golongan Karyawan (A/B/C): ");
        String golongan = input.next().toUpperCase();
        System.out.print("Masukkan Jam Lembur: ");
        int jamLembur = input.nextInt();

        double gajiPokok = 0;
        double gajiLembur = 0;

        if (golongan.equals("A")) {
            gajiPokok = 5000000;
        } else if (golongan.equals("B")) {
            gajiPokok = 6500000;
        } else if (golongan.equals("C")) {
            gajiPokok = 9500000;
        } else {
            System.out.println("Golongan tidak valid!");
            System.exit(0);
        }

        double persenLembur;
        if (jamLembur == 1) {
            persenLembur = 0.30;
        } else if (jamLembur == 2) {
            persenLembur = 0.32;
        } else if (jamLembur == 3) {
            persenLembur = 0.34;
        } else if (jamLembur == 4) {
            persenLembur = 0.36;
        } else if (jamLembur >= 5) {
            persenLembur = 0.38;
        } else {
            persenLembur = 0;
        }

        gajiLembur = gajiPokok * persenLembur;
        double totalGaji = gajiPokok + gajiLembur;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Golongan       : " + golongan);
        System.out.println("Gaji Pokok     : Rp " + gajiPokok);
        System.out.println("Gaji Lembur    : Rp " + gajiLembur);
        System.out.println("Total Gaji     : Rp " + totalGaji);

        input.close();
    }
}
