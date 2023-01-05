package net.pixelplugins.commons.user.dto.request;

import lombok.*;
import net.pixelplugins.commons.user.dto.UserResponse;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReadUserRequest extends UserResponse {

    private String username;

}
