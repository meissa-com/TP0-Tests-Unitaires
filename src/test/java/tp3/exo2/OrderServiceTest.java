package tp3.exo2;

import org.example.tp3.exo2.Order;
import org.example.tp3.exo2.OrderDao;
import org.example.tp3.exo2.OrderService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class OrderServiceTest {

    @Test
    public void testCreateOrder() {
        // Création du mock de OrderDao
        OrderDao orderDaoMock = mock(OrderDao.class);

        // Préparation de l'objet à tester
        OrderService orderService = new OrderService(orderDaoMock);

        // Création d'une commande factice
        org.example.tp3.exo2.Order order = new Order(1L, "New Order");

        // Simuler le comportement (optionnel ici)
        doNothing().when(orderDaoMock).saveOrder(order);

        // Appeler la méthode à tester
        orderService.createOrder(order);

        // Vérification que OrderDao.saveOrder a été appelé avec l'objet order
        verify(orderDaoMock).saveOrder(order);
    }
}
