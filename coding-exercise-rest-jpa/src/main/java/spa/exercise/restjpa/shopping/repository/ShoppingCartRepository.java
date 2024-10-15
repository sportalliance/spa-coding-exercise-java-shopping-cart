package spa.exercise.restjpa.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spa.exercise.restjpa.shopping.model.ShoppingCart;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long> {

}
