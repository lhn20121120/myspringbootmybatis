package com.lk.lambda.controller;

import com.lk.lambda.common.result.JsonResult;
import com.lk.lambda.model.User;
import com.lk.lambda.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController extends BaseController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public JsonResult getUserList() {
        return renderSuccess(userService.selectList());
    }

    @PostMapping("/user/create")
    public JsonResult createUser(@RequestBody User user) {
        return renderSuccess(userService.save(user));
    }

    @PutMapping("/user/update")
    public JsonResult updateUser(@RequestBody User user) {
        return renderSuccess(userService.save(user));
    }

    @PostMapping("/user/create2")
    public JsonResult createUser2() {
        User user = new User();
        user.setName("heheh");
        return renderSuccess(userService.save(user));
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

}
