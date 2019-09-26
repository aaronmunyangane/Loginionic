package com.login.loginBackend.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class UserController {
    @RestController
    @RequestMapping("/users")

    public class UserController {

        @Autowired
        private UserService userService;

        @PostMapping
        public ApiResponse signUp(@RequestBody SignUpDto signUpDto){
            return userService.signUp(signUpDto);
        }

        @PostMapping("/login")
        public ApiResponse login(@RequestBody LoginDto loginDto){
            return userService.login(loginDto);
        }
    }
}
