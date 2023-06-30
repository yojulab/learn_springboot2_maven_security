package com.learn.learn_springboot_security.restapis;

import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learn.learn_springboot_security.Entities.Users;
import com.learn.learn_springboot_security.repositorys.UsersRepository;

@RestController
@RequestMapping(value = "/rest/users")
public class UsersController {
    @Autowired
    UsersRepository userssRepository;

    // request : /rest/users/create
    // input Headers : Content-Type=application/json
    // input Body > raw : {"id": "U-01","username": "Yojulab"}
    @PostMapping("/create")
    //public ResponseEntity<Object> create(@RequestBody Object users) {
    //Object result = null;   //userssRepository.save(users);
    public ResponseEntity<Object> create(@RequestBody Users users) {
        Object result = userssRepository.save(users);
        return ResponseEntity.ok()
                .body(result);
    }

    // request : /rest/users/read/101
    @GetMapping("/read/{id}")
    public ResponseEntity<Object> read(@PathVariable String id) {
        Object result = userssRepository.findById(id);

        return ResponseEntity.ok()
                .body(result);
    }

    // request : /rest/users/update
    // input Headers : Content-Type=application/json
    // input Body > raw : {"id": "U-01","username": "Yoju!"}
    @PutMapping("/update")
    public ResponseEntity<Object> update(@RequestBody Users users) {
        Object result = userssRepository.save(users);
        return ResponseEntity.ok()
                .body(result);
    }

    // /rest/users/delete/101
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Object> delete(@PathVariable String id) {
        userssRepository.deleteById(id);
        Object result = null;
        return ResponseEntity.ok()
                .body(result);

    }

    // request : /rest/users/readall
    @GetMapping("/readall")
    public ResponseEntity<Object> readall() {
        Object result = userssRepository.findAll();

        return ResponseEntity.ok()
                .body(result);
    }
}
