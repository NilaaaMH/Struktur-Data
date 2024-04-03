import java.util.HashMap;
import java.util.Scanner;

public class Inventoriii {
    public static void main(String[] args) {
        HashMap<String, Integer> inventory = new HashMap<>();

        inventory.put("Pensil", 50);
        inventory.put("Buku", 35);
        inventory.put("Penghapus", 25);

        System.out.println("Inventori awal: " + inventory);

        inventory.put("Pensil", inventory.get("Pensil") + 20);

        inventory.remove("Penghapus");

        System.out.println("Inventori setelah update: " + inventory);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nama barang yang ingin dicari: ");
        String barang = scanner.nextLine();

        cariBarang(inventory, barang);
    }
    public static void cariBarang(HashMap<String, Integer> inventoriii, String barang) {
        if(inventoriii.containsKey(barang)) {
            System.out.println("Stok " + barang + ": " + inventoriii.get(barang) + "unit.");
        } else {
            System.out.println("Barang " + barang + "tidak tersedia di inventori.");
        }
    }
}