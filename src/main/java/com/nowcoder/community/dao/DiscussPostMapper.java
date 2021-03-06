package com.nowcoder.community.dao;


import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    List<DiscussPost> selectDiscussPosts(@Param("userId") int userId,@Param("offset") int offset,@Param("limit") int limit);

    //@Param 是用来给参数取别名
    //如果只有一个参数，并且在动态sql中的if标签中的<if>里使用，则必须取别名
    int selectDiscussPostRows(@Param("userId") int userId);

}
