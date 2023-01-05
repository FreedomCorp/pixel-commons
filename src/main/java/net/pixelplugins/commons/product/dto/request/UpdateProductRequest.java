package net.pixelplugins.commons.product.dto.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class UpdateProductRequest {

    private long id;

    private String name;
    private String description;

    private double price;

    private long[] categories;
    private byte[] fileBytes;
}
