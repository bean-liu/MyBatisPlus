package com.jun.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.conditions.SharedString;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jun.mybatisplus.entity.ProductVO;
import com.jun.mybatisplus.entity.User;
import com.jun.mybatisplus.enums.AgeEnum;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper mapper;

    @Test
    void test(){

        mapper.deleteById(2);

        mapper.selectList(null).forEach(System.out::println);

//        mapper.deleteById(4);

        /*UpdateWrapper<User> wrapper = new UpdateWrapper<>();
        wrapper.eq("name", "hn");

        User user = mapper.selectById(7);
        user.setAge(AgeEnum.FOUR);
        mapper.updateById(user);
        System.out.println(user);*/
    }

    @Test
    void query(){
//        QueryWrapper<User> wrapper = new QueryWrapper<User>();
//        Map<String, Object> map = new HashMap<>();
//        map.put("name", "ww");
//        map.put("age", AgeEnum.THREE);
//        wrapper.allEq(map);

//        wrapper.likeLeft("name", "四");
//        wrapper.orderByDesc("id");
//        wrapper.having("id > 2");

//        mapper.selectList(wrapper).forEach(System.out::println);
//        mapper.selectMaps(wrapper).forEach(System.out::println);

        // 需要添加分页插件
        // com.jun.mybatisplus.config.MyBatisPlusConfig.paginationInterceptor
//        Page<User> page = new Page<>(0, 2);
//        Page<User> result = mapper.selectPage(page, null);
//        System.out.println(result.getSize());
//        System.out.println(result.getTotal());
//        result.getRecords().forEach(System.out::println);

        //关联查询
        Page<ProductVO> page = new Page<>(2, 2);
        Page<ProductVO> result = mapper.productPage(page, 5);
        result.getRecords().forEach(System.out::println);


    }
}