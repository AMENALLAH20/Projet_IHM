package com.amen.loisir.Controller;

import com.amen.loisir.DTO.UserRequest;
import com.amen.loisir.Entities.User;
import com.amen.loisir.Repositories.RoleRepository;
import com.amen.loisir.Services.UserService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/user")
@RestController
@AllArgsConstructor
public class UserController {

    private final UserService userService;
    private final RoleRepository roleRepository;

    @PostMapping("/add")
    public User add(@RequestBody UserRequest user) {
        System.out.println(user);
        return userService.add(user);
    }
}
