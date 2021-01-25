import java.util.Comparator;

public class ComparatorCost implements Comparator<Product> {
    @Override
    public int compare(Product product, Product t1) {
        if (product.getCost() < t1.getCost()) {
            return 1;
        } else if (product.getCost() == t1.getCost()) {
            return 0;
        } else {
            return -1;
        }
    }
}
