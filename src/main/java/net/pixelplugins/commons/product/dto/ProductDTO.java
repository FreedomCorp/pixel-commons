package net.pixelplugins.commons.product.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class ProductDTO {

    private long categoryId;

    private String name;
    private String description;

    private double price;
}
