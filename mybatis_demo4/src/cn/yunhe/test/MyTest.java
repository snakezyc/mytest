package cn.yunhe.test;

import cn.yunhe.dao.OrderMapper;
import cn.yunhe.dao.UserMapper;
import cn.yunhe.pojo.Order;
import cn.yunhe.pojo.User;
import cn.yunhe.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import javax.xml.transform.Source;

public class MyTest {

    @Test
    public void t1(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        Order order = sqlSession.getMapper(OrderMapper.class).findOrderAndUserById(2);
        System.out.println(order);
        sqlSession.close();
    }

    @Test
    public void t2(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        User user = sqlSession.getMapper(UserMapper.class).getUserAndOrdersById(41);
        System.out.println(user);
        sqlSession.close();
    }


}
