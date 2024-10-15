package spa.exercise.restjpa.shopping.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spa.exercise.restjpa.shopping.model.ShoppingCart;
import spa.exercise.restjpa.shopping.service.ShoppingCartService;

import java.util.List;

@RestController("/api/shopping-cart")
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;
    private final ShoppingCartConverter shoppingCartConverter;

    public ShoppingCartController(ShoppingCartService shoppingCartService, ShoppingCartConverter shoppingCartConverter) {
        this.shoppingCartService = shoppingCartService;
        this.shoppingCartConverter = shoppingCartConverter;
    }

    @GetMapping
    public ResponseEntity<List<ShoppingCartDto>> getCart() {
        List<ShoppingCart> carts = shoppingCartService.getCarts();
        List<ShoppingCartDto> cartDtos = carts.stream().map(shoppingCartConverter::convert).toList();
        return ResponseEntity.ok(cartDtos);
    }
}
