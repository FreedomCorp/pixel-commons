package net.pixelplugins.commons.user.dto.request;

import lombok.*;
import net.pixelplugins.commons.user.dto.UserResponse;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateUserRequest extends UserResponse {

    private String name;
    private String username;
    private String email;
    private String password;

}

