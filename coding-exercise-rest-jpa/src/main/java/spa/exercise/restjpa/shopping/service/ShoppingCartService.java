package spa.exercise.restjpa.shopping.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spa.exercise.restjpa.shopping.model.ShoppingCart;
import spa.exercise.restjpa.shopping.repository.ShoppingCartRepository;

import java.util.List;

@Transactional
@Service
public class ShoppingCartService {

    private final ShoppingCartRepository shoppingCartRepository;

    public ShoppingCartService(ShoppingCartRepository shoppingCartRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
    }

    public List<ShoppingCart> getCarts() {
        return shoppingCartRepository.findAll();
    }
}

