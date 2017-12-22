
import model.MybatisDemo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by ${MIND-ZR} on 2017/12/18.
 */
public class selectDemo {

    public static void main(String[] args) throws IOException {
        /*
         * 1.加载mybatis的配置文件，初始化mybatis，创建出SqlSessionFactory，是创建SqlSession的工厂
         * 这里只是为了演示的需要，SqlSessionFactory临时创建出来，在实际的使用中，SqlSessionFactory只需要创建一次，当作单例来使用
         */
        InputStream inputStream= Resources.getResourceAsStream("mybatisConfig.xml");

        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();

        SqlSessionFactory sqlSessionFactory=builder.build(inputStream);


        //2. 从SqlSession工厂 SqlSessionFactory中创建一个SqlSession，进行数据库操作
        SqlSession sqlSession=sqlSessionFactory.openSession();
/*
        MybatisDemo mybatisDemo;

        mybatisDemo.setmAge(16);
        user.setmName("小三");
       //3.使用SqlSession查询*/
        MybatisDemo mybatisDemo=new MybatisDemo();
        long starttime= System.currentTimeMillis();
        System.out.println("开始查询时间"+starttime);
        mybatisDemo= sqlSession.selectOne("dao.MybatisDemoMapper.selectByPrimaryKey" ,1);

        System.out.println(mybatisDemo);


        long endtime=System.currentTimeMillis();
        long time =endtime-starttime;
        System.out.println("花费时间"+time);

        long starttime2=System.currentTimeMillis();
        System.out.println("第二次查询开始"+starttime2);

        MybatisDemo m=new MybatisDemo();
        m.setmAge(123);
        m.setmName("123");


        int s= sqlSession.insert("dao.MybatisDemoMapper.insert",m);
        System.out.println(s+"***********************");
        long endtime2=System.currentTimeMillis();
        long time2=endtime2-starttime2;
        System.out.println("第二次插入所用时间"+time2);
        //System.out.println(resultCount);
        sqlSession.commit();
    }
}
