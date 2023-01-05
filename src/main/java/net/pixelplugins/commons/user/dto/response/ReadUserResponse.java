package net.pixelplugins.commons.user.dto.response;

import lombok.*;
import net.pixelplugins.commons.product.dto.ProductDTO;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReadUserResponse {

    private long id;

    private String name;
    private String username;
    private String email;

    private double balance;
    private double credits;

    private List<ProductDTO> products;
}

