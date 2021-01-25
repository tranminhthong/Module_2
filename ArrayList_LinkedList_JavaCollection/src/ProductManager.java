import java.util.ArrayList;

public class ProductManager {
    ArrayList<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public void update(int id, String name) {
        for (Product p : products) {
            if (p.getId() == id) {
                p.setName(name);
            }
        }
    }

    public void delete(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(products.get(i));
            }
        }
    }

    public void showProduct() {
        if (products.size()==0){
            System.out.println("Have no product");
        }else
        for (Product p : products) {
            System.out.println(p.toString());
        }
    }

    public void searchProduct(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.println(product.toString());
            }
        }
    }
}
