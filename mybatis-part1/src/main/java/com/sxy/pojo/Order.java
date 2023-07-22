package com.sxy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @description: 订单表，order，
 * @author: suxingyu
 * @create: 2022-10-19 21:51
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    //订单表主键id
    private Integer id;
    //订单价格
    private Integer price;
    //订单所属用户的id
    private Integer userId;
    //订单的备注
    private String remark;
    //订单创建时间
    private LocalDateTime createTime;

}