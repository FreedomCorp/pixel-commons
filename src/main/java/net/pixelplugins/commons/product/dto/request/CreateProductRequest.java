package net.pixelplugins.commons.product.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateProductRequest {

    private String name;
    private String description;
    private String author;
    private String version;

    private double price;
    private double creditPrice;

    private byte[] file;
    private long categoryId;

}
