package net.pixelplugins.commons.category.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CreateCategoryResponse {

    private long id;

    private String name;
    private Date createdAt;

}
