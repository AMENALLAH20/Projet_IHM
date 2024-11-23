package com.amen.loisir.DTO;

import com.amen.loisir.Entities.Role;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequest {
    @JsonIgnore(value = false)
    private Long iduser;
    private String fname;
    private String lname;
    private String password;
    private String email;
    private String adresse;
    private String username;



    private List<Role> roles;
}


