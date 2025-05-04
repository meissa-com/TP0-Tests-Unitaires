package tp3.exo2;

import org.example.tp3.exo2.Order;
import org.example.tp3.exo2.OrderDao;

public class OrderService {
    private OrderDao orderDao;

    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void createOrder(Order order) {
        orderDao.saveOrder(order);
    }
}
