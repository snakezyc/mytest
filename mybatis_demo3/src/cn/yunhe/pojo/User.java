package cn.yunhe.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

  private Integer id;
  private String username;
  private Date birthday;
  private String sex;
  private String address;

  public User(String username, Date birthday, String sex, String address) {
    this.username = username;
    this.birthday = birthday;
    this.sex = sex;
    this.address = address;
  }
}
