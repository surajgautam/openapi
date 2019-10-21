package com.surajgautam.openapi.api;

import com.surajgautam.openapi.server.model.UserRequest;
import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@RestController
@Api(tags = "users")
public class UserController implements UsersApi {

    @Override
    public ResponseEntity<List<String>> usersGet() {
        return new ResponseEntity<>(Arrays.asList("zxc", "xxx"), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<String> createUser(@Valid UserRequest body) {
        return null;
    }
}
