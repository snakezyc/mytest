package cn.yunhe.dao;

import cn.yunhe.pojo.QueryVo;
import cn.yunhe.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<User> getUsersBySexAndUserName(@Param("name")String name,@Param("sex")String sex);

    List<User> getUsersByParams(User user);

    void update(User user);

    void save(User user);

    List<User> getUsersBySexAndUserName2(@Param("name")String name,@Param("sex")String sex);

    List<User> getUsersByIds(List<Integer> ids);

    List<User> getUsersByIds2(int[] ids);

    List<User> getUsersByIds3(QueryVo queryVo);

    List<User> getUsersByIds4(Map<String,Object> map);


}
