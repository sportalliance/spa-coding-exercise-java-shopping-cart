package spa.exercise.restjpa.shopping.controller;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import spa.exercise.restjpa.shopping.model.ShoppingCart;
import spa.exercise.restjpa.shopping.model.ShoppingCartItem;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShoppingCartConverter implements Converter<ShoppingCart, ShoppingCartDto> {

    @Override
    public ShoppingCartDto convert(ShoppingCart source) {
        ShoppingCartDto target = new ShoppingCartDto();
        target.setId(source.getId());
        List<ShoppingCartItemDto> items = new ArrayList<>();
        target.setItems(items);
        return target;
    }

    private ShoppingCartItemDto convertItem(ShoppingCartItem item) {
        ShoppingCartItemDto Dto = new ShoppingCartItemDto();
        Dto.setProductName(item.getProductName());
        Dto.setQuantity(item.getQuantity());
        Dto.setPrice(item.getPrice());
        return Dto;
    }

}

