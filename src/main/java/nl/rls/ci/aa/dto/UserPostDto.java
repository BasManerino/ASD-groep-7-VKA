package nl.rls.ci.aa.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserPostDto {
    private String password;
    private String firstName;
    private String lastName;
    private String email;
}
