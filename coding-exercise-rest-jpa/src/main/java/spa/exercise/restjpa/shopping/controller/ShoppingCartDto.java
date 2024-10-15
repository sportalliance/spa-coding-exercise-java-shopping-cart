package spa.exercise.restjpa.shopping.controller;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartDto {
    private Long id;
    private List<ShoppingCartItemDto> items = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ShoppingCartItemDto> getItems() {
        return items;
    }

    public void setItems(List<ShoppingCartItemDto> items) {
        this.items = items;
    }
}



