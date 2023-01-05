package net.pixelplugins.commons.product.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.pixelplugins.commons.product.dto.ProductDTO;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReadProductResponse {

    private String name;
    private String description;
    private String author;
    private String version;

    private double price;

    private double creditPrice;

    private byte[] file;

    private long categoryId;

    public ProductDTO toDTO() {
        return new ProductDTO(categoryId, name, description, price);
    }
}
