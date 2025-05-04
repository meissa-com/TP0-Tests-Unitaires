package tp3.exo3;

import org.example.tp3.exo3.Product;

public interface ProductApiClient {
    Product getProduct(String productId) throws Exception;
}
