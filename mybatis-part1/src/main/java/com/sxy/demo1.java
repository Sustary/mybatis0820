package com.sxy;

import com.sxy.mapper.UserMapper;
import com.sxy.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @description: 用来测试 mybatis 操作
 * @author: suxingyu
 * @create: 2022-08-20 17:57
 **/
public class demo1 {
    public static void main(String[] args) throws IOException {
        //定义mybatis配置文件的路径
        String resource = "mybatis-config.xml";
        //读取配置文件的内容
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建 SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //根据 SqlSessionFactory 进行 mapper 的操作
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            //得到 mapper 对象
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            //开始 增删改查操作
            //List<User> userList = userMapper.selectAll();
            //System.out.println("userList 是" + userList);
            ////for (User user : userList) {
            ////    System.out.println("user是" + user);
            ////}
            //
            //User user = userMapper.selectById(3);
            //System.out.println("user 是" + user);
            //
            ////User user1 = new User(1,"",,"");
            //List<User> users = userMapper.selectByUser(new User(1, "null", null, "上海"));
            //System.out.println("selectByUser 是" + users);

            //List<User> selectByCondition = userMapper.selectByCondition(" ", "上海");
            //List<User> selectByCondition = userMapper.selectByCondition(null, "上海");
            //System.out.println("selectByCondition 是" + selectByCondition);

            //User user1 = new User();
            //user1.setAge(29);
            //user1.setAddress("合肥");
            //user1.setUsername("sxy");
            //userMapper.insertUser(user1);
            //System.out.println("user1 是" + user1);
            //
            //userMapper.deleteById(15);
            //
            //userMapper.updateUser(new User(16,"aaa",null,null));

            //userMapper.updateUser1(new User(16,"bbb",null,null));


            //
            //List<User> userList = userMapper.selectByIds(new Integer[]{1, 2, 3, 4, 5});
            //System.out.println("userList 是" + userList);

            //1.
            //List<User> selectChooseUser = userMapper.selectChoose(new User(2, sxy, 298, ""));
            //System.out.println("userList 是" + selectChooseUser);

            //2.
            //List<User> selectChooseUser = userMapper.selectChoose(new User(null, "sxy", 298, ""));
            //System.out.println("userList 是" + selectChooseUser);

            //3.
            //List<User> selectChooseUser = userMapper.selectChoose(new User(null, null, 298, ""));
            //System.out.println("userList 是" + selectChooseUser);


            //提交事务
            sqlSession.commit();
            //释放资源
            sqlSession.close();
        }


        ////获取Sqlsession对象
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        ////获取UserDao实现类对象
        //UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        ////调用方法测试
        //List<User> userList = userDao.findAll();
        //System.out.println(userList);
        ////释放资源
        //sqlSession.close();
    }
}