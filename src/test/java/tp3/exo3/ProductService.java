package tp3.exo3;

import org.example.tp3.exo3.Product;
import org.example.tp3.exo3.ProductApiClient;

public class ProductService {
    private ProductApiClient productApiClient;

    public ProductService(ProductApiClient productApiClient) {
        this.productApiClient = productApiClient;
    }

    public Product getProduct(String productId) throws Exception {
        return productApiClient.getProduct(productId);
    }
}
