package itheima.springbootdemo;

import itheima.springbootdemo.mapper.UserMapper;
import itheima.springbootdemo.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


// SpringRunner继承自SpringJUnit4ClassRunner，使用哪一个Spring提供的测试测试引擎都可以
@RunWith(SpringRunner.class)
// @SpringBootTest的属性指定的是引导类的字节码对象
@SpringBootTest(classes = SpringbootDemoApplication.class)
public class SpringbootDemoApplicationTests {

    // 注入
    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
        List<User> listUser = userMapper.findAll();
        for (User user : listUser) {
            System.out.println(user);
        }
    }

}
