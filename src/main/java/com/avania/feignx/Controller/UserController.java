package com.avania.feignx.Controller;

import com.avania.feignx.DTO.Model;
import com.avania.feignx.FeignClient.UserClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserClient userClient;
    @GetMapping("/allUsers")
    public List<Model> getAllUsers(){
        return userClient.getUsers();

    }
}
