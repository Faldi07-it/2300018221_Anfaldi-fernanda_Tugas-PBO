public class Item {
    private final double itemPrice; // Harga item
    private final String itemName; // Nama itemk
    private final String itemCode; // Kode item
    private final int itemStock; // Jumlah stok item
    // Konstruktor untuk menginisialisasi item
    public Item(String code, String name, double price, int stock) {
        this.itemCode = code; // Mengatur kode item
        this.itemName = name; // Mengatur nama item
        this.itemPrice = price; // Mengatur harga item
        this.itemStock = stock; // Mengatur jumlah stok
    }
    // Getter untuk harga item
    public double getPrice() {
        return itemPrice;
    }
    // Getter untuk kode item
    public String getCode() {
        return itemCode;
    }
    // Getter untuk nama item
    public String getName() {
        return itemName;
    }
    // Getter untuk jumlah stok item
    public int getStock() {
        return itemStock;
    }
}