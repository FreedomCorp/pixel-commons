package net.pixelplugins.commons.category.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.pixelplugins.commons.product.dto.response.ReadProductResponse;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReadCategoryResponse {

    private long id;

    private String name;

    private List<ReadProductResponse> products;

}
