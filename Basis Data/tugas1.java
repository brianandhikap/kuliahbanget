import java.util.Arrays;
import java.util.LinkedList;

public class tugas1 {

    public static void main(String[] args) {

        // 1
        float StrukturBaris = 0.0F;

        // 2
        String SusunanKataBaru = "Pemrograman Struktur Data Java";

        // 3
        int[] DelapanAngka = {
            10, 12, 18, 23, 33, 58, 67, 82
        };

        // 4
        String[][] DuaAngka = {
            {"2", "4", "6"},
            {"8", "10", "12"},
            {"14", "16", "18"}
        };

        // 5
        LinkedList<Integer> UrutanListAngka =
                new LinkedList<>(Arrays.asList(15, 28, 33, 47, 59));

        // Output
        System.out.println(SusunanKataBaru);
        System.out.println(Arrays.toString(DelapanAngka));
        System.out.println(UrutanListAngka);
    }
}