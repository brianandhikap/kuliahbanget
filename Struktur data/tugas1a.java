import java.util.LinkedList;
import java.util.Arrays;

public class tugas1a {
    public static void main(String[] args) {

        float StrukturBaris = 0.0f;

        String SusunanKataBaru = "Pemrograman Struktur Data Java";

        int[] DelapanAngka = {10, 12, 18, 23, 33, 58, 67, 82};

        String[][] DuaAngka = {
            {"2", "4", "6"},
            {"8", "10", "12"},
            {"14", "16", "18"}
        };

        LinkedList<Integer> UrutanListAngka =
                new LinkedList<>(Arrays.asList(15, 28, 33, 47, 59));
        
        System.out.println(SusunanKataBaru);
        System.out.println(Arrays.toString(DelapanAngka));
        System.out.println(UrutanListAngka);
    }
}