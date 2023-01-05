package net.pixelplugins.commons.product.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
public class UpdateProductResponse {

    private long id;

    private String name;
    private String description;

    private double version;
    private double price;

    private long[] categories;
    private byte[] fileBytes;
}
