package com.cri.mapper;

import com.cri.vo.userinfo;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * UserInfoMapper 开发模型指导
 *
 * @author csg
 * @create 2017-06-19:09
 */
@Mapper
public interface UserInfoMapper {

    @Insert("INSERT INTO userinfo(`id`, `username`, `creattime`, `pwd`) VALUES (#{id}, #{username}, #{creattime}, #{pwd})")
    int insert(userinfo userInfo);


    @Delete("DELETE FROM category_item WHERE `id` = #{id} and `user_id` = #{userId}")
    int delete(@Param("id") Long id, @Param("userId") Long userId);

    @Delete("DELETE FROM category_item WHERE `category_id` = #{categoryId} and `user_id` = #{userId}")
    int deleteCategory(@Param("categoryId") Long categoryId, @Param("userId") Long userId);

    @Select("SELECT `category_id` FROM category_item WHERE `id` = #{id} and `user_id` = #{userId}")
    Long selectCategoryId(@Param("id") Long id, @Param("userId") Long userId);

    @Select("SELECT * FROM category_item WHERE `category_id` = #{categoryId} and `user_id` = #{userId}")
    List<userinfo> selectByCategoryIdAndUserId(@Param("categoryId") Long categoryId, @Param("userId") Long userId);

    @Select("SELECT ci.id,ci.user_id,category_id,type,ci.name,image,url from category_item ci left join category c on ci.category_id = c.id where ci.user_id = #{userId} order by ci.id desc limit 20")
    List<userinfo> selectNews(@Param("userId") Long userId);
}
