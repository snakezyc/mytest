package cn.yunhe.test;

import cn.yunhe.dao.UserMapper;
import cn.yunhe.pojo.QueryVo;
import cn.yunhe.pojo.User;
import cn.yunhe.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class MyTest {

    @Test
    public void t1(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
//        List<User> users = sqlSession.getMapper(UserMapper.class).getUsersBySexAndUserName("张", "男");//两个都传
//        List<User> users = sqlSession.getMapper(UserMapper.class).getUsersBySexAndUserName(null, null);//两个都不传
//        List<User> users = sqlSession.getMapper(UserMapper.class).getUsersBySexAndUserName("王", null);//只传递一个
        List<User> users = sqlSession.getMapper(UserMapper.class).getUsersBySexAndUserName(null, "女");//只传递一个
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void t2(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        User myuser = new User();
//        myuser.setUsername("王");
        myuser.setSex("男");
        List<User> users = sqlSession.getMapper(UserMapper.class).getUsersByParams(myuser);
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }


    @Test
    public void t3(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        User myuser = new User();
        myuser.setAddress("开封");
        myuser.setId(54);
        sqlSession.getMapper(UserMapper.class).update(myuser);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void t4(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        User myuser = new User();
        myuser.setAddress("开封");
        sqlSession.getMapper(UserMapper.class).save(myuser);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void t5(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        User myuser = new User("小明",new Date(),"男","上海");
        sqlSession.getMapper(UserMapper.class).save(myuser);
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void t6(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        List<User> users = sqlSession.getMapper(UserMapper.class).getUsersBySexAndUserName2(null, null);//只传递一个
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void t7(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        List<User> users = sqlSession.getMapper(UserMapper.class).getUsersByIds(Arrays.asList(41,42,43,44,100));
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void t8(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        int[] ids = {41,42,43,44,100};
        List<User> users = sqlSession.getMapper(UserMapper.class).getUsersByIds2(ids);
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void t9(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        QueryVo queryVo = new QueryVo();
        queryVo.setIds(Arrays.asList(41,42,43,44,100));
        List<User> users = sqlSession.getMapper(UserMapper.class).getUsersByIds3(queryVo);
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }


    @Test
    public void t10(){
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        Map<String,Object> map = new HashMap<>();
        map.put("sex","男");
        map.put("ids",Arrays.asList(41,42,43,44,100));
        List<User> users = sqlSession.getMapper(UserMapper.class).getUsersByIds4(map);
        for (User user : users) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
