package com.mdsantos.learningspring.resources;

import com.mdsantos.learningspring.entities.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping()
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "maria@maria.com", "99999999", "12345");
        return ResponseEntity.status(HttpStatus.OK).body(u);
    }
}
