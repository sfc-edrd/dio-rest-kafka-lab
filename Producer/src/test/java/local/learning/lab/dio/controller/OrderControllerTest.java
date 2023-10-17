package local.learning.lab.dio.controller;


import local.learning.lab.dio.data.OrderData;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class OrderControllerTest {

    @Autowired
    private OrderController orderController;

    @Test
    void saveOrder()
    {
        OrderData orderData = new OrderData(
                "090001",
                "Secador de cabelo",
                new BigDecimal(1-200));
        orderController.saveOrder(orderData);
    }
}