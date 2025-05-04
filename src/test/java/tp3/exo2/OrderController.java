package tp3.exo2;

import org.example.tp3.exo2.Order;
import org.example.tp3.exo2.OrderService;

public class OrderController {
    private org.example.tp3.exo2.OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public void createOrder(Order order) {
        orderService.createOrder(order);
    }
}
