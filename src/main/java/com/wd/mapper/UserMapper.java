package com.wd.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wd.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: weigj
 * @Date: 2025/4/2 - 04 - 02 - 15:45
 * @Description: com.wd.mapper
 * @version: 1.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
