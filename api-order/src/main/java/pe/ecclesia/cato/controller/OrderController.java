package pe.ecclesia.cato.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import pe.ecclesia.cato.api.dto.Order;
import pe.ecclesia.cato.api.interfaces.OrdersApi;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController implements OrdersApi {
    @Override
    public ResponseEntity<List<Order>> getAllOrders() {
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
    }
}
