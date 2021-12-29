package com.jun.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.jun.mybatisplus.entity.ProductVO;
import com.jun.mybatisplus.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper extends BaseMapper<User> {

    @Select("select p.*, u.name userName from product p, user u where p.user_id = u.id and u.id = #{id}")
    List<ProductVO> productList(Integer id);
    @Select("select p.*, u.name userName from product p, user u where p.user_id = u.id and u.id = #{id}")
    Page<ProductVO> productPage(Page<ProductVO> page, Integer id);
}
