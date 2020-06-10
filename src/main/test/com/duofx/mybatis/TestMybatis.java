package com.duofx.mybatis;

import com.duofx.dao.PersonMapperDao;
import com.duofx.model.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import util.BaseJunit4Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by duofx on 2020/6/9.
 */

public class TestMybatis extends BaseJunit4Test {

    private SqlSessionFactory factory;

    @Before
    public void init() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        factory = builder.build(inputStream);
        inputStream.close();
    }

    @Test
    public void TestMybatis() throws IOException {
        SqlSession sqlSession = factory.openSession();
        PersonMapperDao mapper = sqlSession.getMapper(PersonMapperDao.class);
        Person personById = mapper.findPersonById(1);
        System.out.println(personById);

    }


}
