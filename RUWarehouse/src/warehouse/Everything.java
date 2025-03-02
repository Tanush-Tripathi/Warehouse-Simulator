package warehouse;

/*
 * Use this class to put it all together.
 */ 
public class Everything {
    public static void main(String[] args) {
        StdIn.setFile(args[0]);
        StdOut.setFile(args[1]);

	// Use this file to test all methods

    int n = StdIn.readInt();
    Warehouse warehouse = new Warehouse();
    int day = 0;
    int id = 0;
    String name = "";
    int stock = 0;
    int demand = 0;
    int amount = 0;
    for (int i = 0; i < n; i++) {
        String query = StdIn.readString();
        switch (query) {
            case "add":
            day = StdIn.readInt();
            id = StdIn.readInt();
            name = StdIn.readString();
            stock = StdIn.readInt();
            demand = StdIn.readInt();
            warehouse.addProduct(id, name, stock, day, demand);
                break;
            case "restock":
            id = StdIn.readInt();
            amount = StdIn.readInt();
            warehouse.restockProduct(id, amount);
                break;
            case "purchase":
            day = StdIn.readInt();
            id = StdIn.readInt();
            amount = StdIn.readInt();
            warehouse.purchaseProduct(id, day, amount);
                break;
            case "delete":
            id = StdIn.readInt();
            warehouse.deleteProduct(id);
                break;
            default:
                break;
        }
    }
    StdOut.println(warehouse);
    }
}
