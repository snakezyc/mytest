package cn.yunhe.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;


/**
 * mybatis工具类
 */
public class MyBatisUtil {
    private static SqlSessionFactory sqlSessionFactory;

    static {//类加载的时候就去执行，并且只执行一次
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(){
        //默认的是手动提交事务
        return sqlSessionFactory.openSession();
    }
}
