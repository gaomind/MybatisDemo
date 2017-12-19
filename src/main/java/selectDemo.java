

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


        //3.使用SqlSession查询
        User U=sqlSession.selectOne("dao.Mapper.selectById",2);

        System.out.println(U);
    }
}
