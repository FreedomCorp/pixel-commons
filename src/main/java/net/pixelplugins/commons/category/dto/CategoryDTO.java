package net.pixelplugins.commons.category.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class CategoryDTO {

    private long id;

    private String name;
    private String description;

}
