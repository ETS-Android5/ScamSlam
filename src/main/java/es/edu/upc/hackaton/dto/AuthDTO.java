package es.edu.upc.hackaton.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AuthDTO {
    private String email;
    private String firstName;
    private String lastName;
    private String encodedPassword;
}