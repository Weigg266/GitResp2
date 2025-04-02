package com.wd.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import jdk.jfr.DataAmount;
import lombok.Data;
import org.apache.ibatis.javassist.SerialVersionUID;

import java.io.Serializable;

/**
 * @Auther: weigj
 * @Date: 2025/4/2 - 04 - 02 - 15:20
 * @Description: com.wd.pojo
 * @version: 1.0
 */

@Data
@TableName("t_user")
public class User implements Serializable {

    @TableField("uid")
    private Integer id;

    @TableField("uname")
    private String name;

    private String pwd;

    private String realName;

    private String identity;

}
