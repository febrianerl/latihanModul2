import java.util.ArrayList;
public class list {
    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>();
        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");
        System.out.println("Nama Hewan : ");
        System.out.println(hewan);

        ArrayList<String> delHewan = new ArrayList<>();
        delHewan.add("Kelinci");
        delHewan.add("Kambing");
        delHewan.add("Unta");
        ArrayList<String> delData = new ArrayList<>();

        for (String warna : delHewan) {
            hewan.removeIf(h -> h.equals(warna));
            delData.add(warna);
        }

        System.out.println("\nHewan yang dihapus : ");
        System.out.println(delData);
        System.out.println("\nHewan Setelah DiHapus : ");
        System.out.println(hewan);
    }
}