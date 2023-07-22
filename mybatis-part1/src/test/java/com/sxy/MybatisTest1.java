package com.sxy;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.net.ssl.SSLServerSocket;
import java.io.IOException;
import java.io.InputStream;

/**
 * @description: 测试类
 * @author: suxingyu
 * @create: 2022-10-19 22:32
 **/

public class MybatisTest1 {
    //定义全局变量 sqlSession
    private SqlSession sqlSession;

    @Before
    public void init() throws IOException {
        //定义mybatis配置文件的路径
        String resource = "mybatis-config.xml";
        //读取配置文件的内容
        InputStream resourceAsStream = Resources.getResourceAsStream(resource);
        //创建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //得到 SqlSession 实例
        sqlSession = sqlSessionFactory.openSession();
    }

    @Test
    public void test1() {
        // Here is some test code in master branch.
        // Hers is some code in develop branch.
        // Test rebase develop onto master
    }

    @After
    public void destroy() {
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }
}