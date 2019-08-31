package itheima.springbootdemo.controller;

import itheima.springbootdemo.mapper.UserMapper;
import itheima.springbootdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * 测试的servlet
 */
@RestController
@RequestMapping("/user")
public class UserController {

    // 注入对象
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/findAll")
    public User findAll(){
        return userMapper.findAll().get(0);
    }
}
