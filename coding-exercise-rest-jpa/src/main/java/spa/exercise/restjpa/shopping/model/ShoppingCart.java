package spa.exercise.restjpa.shopping.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shopping_cart")
public class ShoppingCart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "shoppingCart", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ShoppingCartItem> items = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public List<ShoppingCartItem> getItems() {
        return items;
    }
}
