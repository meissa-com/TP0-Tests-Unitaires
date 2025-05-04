package tp3.exo2;

import org.example.tp3.exo2.Order;
import org.example.tp3.exo2.OrderController;
import org.example.tp3.exo2.OrderDao;
import org.example.tp3.exo2.OrderService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class OrderControllerTest {

    @Test
    public void testCreateOrder() {
        // Création des mocks
        org.example.tp3.exo2.OrderService orderServiceMock = mock(OrderService.class);
        org.example.tp3.exo2.OrderDao orderDaoMock = mock(OrderDao.class);

        // Préparation de l'objet à tester
        OrderController orderController = new OrderController(orderServiceMock);

        // Création d'une commande factice
        org.example.tp3.exo2.Order order = new Order(1L, "New Order");

        // Simuler que OrderService utilise OrderDao (configuration supplémentaire si on teste en profondeur)
        doNothing().when(orderServiceMock).createOrder(order);

        // Appeler la méthode à tester
        orderController.createOrder(order);

        // Vérification que OrderService.createOrder a été appelé avec l'objet order
        verify(orderServiceMock).createOrder(order);
    }
}
