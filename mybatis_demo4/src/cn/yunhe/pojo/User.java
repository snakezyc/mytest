package cn.yunhe.pojo;


import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class User {

  private Integer id;
  private String username;
  private Date birthday;
  private String sex;
  private String address;
  private List<Order> orders;

}
