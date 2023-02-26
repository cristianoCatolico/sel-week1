package pe.ecclesia.cato.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import pe.ecclesia.cato.api.dto.Product;
import pe.ecclesia.cato.api.interfaces.ProductsApi;

import java.util.ArrayList;
import java.util.List;


@RestController
public class ProductController implements ProductsApi {
    @Override
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<>(new ArrayList<>(), HttpStatus.OK);
    }
}
