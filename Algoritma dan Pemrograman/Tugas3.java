import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] gaji = {5000000, 6500000, 9500000};

        int[] persenLembur = {30, 32, 34, 36, 38};

        System.out.print("Input Golongan (A/B/C): ");
        String gol = input.nextLine().toUpperCase();

        System.out.print("Jumlah jam lembur: ");
        int jam = input.nextInt();

        int indexGaji = 0;

        if (gol.equals("A")) {
            indexGaji = 0;
        } else if (gol.equals("B")) {
            indexGaji = 1;
        } else if (gol.equals("C")) {
            indexGaji = 2;
        } else {
            System.out.println("Golongan tidak valid!");
            return;
        }

        int gajiPokok = gaji[indexGaji];

        int persen = 0;

        if (jam == 1) {
            persen = persenLembur[0];
        } else if (jam == 2) {
            persen = persenLembur[1];
        } else if (jam == 3) {
            persen = persenLembur[2];
        } else if (jam == 4) {
            persen = persenLembur[3];
        } else if (jam >= 5) {
            persen = persenLembur[4];
        }

        double gajiLembur = (gajiPokok * persen) / 100.0;

        double totalGaji = gajiPokok + gajiLembur;

        System.out.println("----------------------------");
        System.out.println("Golongan        : " + gol);
        System.out.println("Gaji Pokok      : " + gajiPokok);
        System.out.println("Persen Lembur   : " + persen + "%");
        System.out.println("Gaji Lembur     : " + gajiLembur);
        System.out.println("Total Gaji      : " + totalGaji);
        System.out.println("----------------------------");
    }
}
