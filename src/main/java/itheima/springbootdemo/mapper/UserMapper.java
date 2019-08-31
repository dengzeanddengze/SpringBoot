package itheima.springbootdemo.mapper;

import itheima.springbootdemo.pojo.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;


/**
 * 实体类的映射接口
 */

// 标记该类是mybatis的mapper接口 自动注入到spring容器中
@Mapper
public interface UserMapper {

    /**
     * 查询所有信息的方法
     * @return
     */
    public List<User> findAll();
}
