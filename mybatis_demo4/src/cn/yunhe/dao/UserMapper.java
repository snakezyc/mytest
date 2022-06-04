package cn.yunhe.dao;

import cn.yunhe.pojo.User;

public interface UserMapper {

    User getUserAndOrdersById(int id);
}
