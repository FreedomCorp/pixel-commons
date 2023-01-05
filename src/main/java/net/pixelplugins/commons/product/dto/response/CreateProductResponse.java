package net.pixelplugins.commons.product.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import net.pixelplugins.commons.category.dto.CategoryDTO;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class CreateProductResponse {

    private long id;

    private String author;
    private String name;
    private String description;

    private double version;
    private double price;

    private List<CategoryDTO> categories;

    private byte[] fileBytes;
}
