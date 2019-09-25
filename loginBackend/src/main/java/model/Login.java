package model;

import javax.persistence.Id;

public class Login {
    @Id
    private String id;
    private String email;
    private String password;

}
