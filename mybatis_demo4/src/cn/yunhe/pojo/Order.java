package cn.yunhe.pojo;


import lombok.Data;

import java.util.Date;

@Data
public class Order {

  private Integer id;
  private Integer uid;
  private Date ordertime;
  private Double money;
  //描述和用户的关系
  private User user;
}
