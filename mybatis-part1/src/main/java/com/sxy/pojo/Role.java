package com.sxy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 角色表，role，
 * @author: suxingyu
 * @create: 2022-10-19 22:01
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    //角色表主键id
    private Integer id;
    //角色名称
    private String name;
    //角色描述
    private String desc;
}