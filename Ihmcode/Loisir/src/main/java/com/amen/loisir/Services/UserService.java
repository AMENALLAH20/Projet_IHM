package com.amen.loisir.Services;


import com.amen.loisir.Entities.User;
import com.amen.loisir.Exception.BCryptPasswordEncoder;
import com.amen.loisir.Exception.BadRequestHttpException;
import com.amen.loisir.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.amen.loisir.DTO.UserRequest;

@Service
public class UserService {

    private static User buildUser(UserRequest o) {
        return User.builder()
                .id(o.getIduser())
                .lname(o.getLname())
                .fname(o.getFname())
                .email(o.getEmail())
                .password(o.getPassword())
                .roles(o.getRoles())
                .build();
    }


    @Autowired
    UserRepository userRepository;


    public User add(UserRequest o) {


            var user = buildUser(o);
            return userRepository.save(user);

    }
}
