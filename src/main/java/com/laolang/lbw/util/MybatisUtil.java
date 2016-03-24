package com.laolang.lbw.util;

import java.io.IOException;
import java.io.InputStream;
 
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
 
public class MybatisUtil {
 
     
     
    public static SqlSessionFactory getSqlSessionFactory(){
        if( null == sqlSessionFactory ){
             
            try {
                InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
         
        return sqlSessionFactory;
    }
    
    public static SqlSessionFactory getSqlSessionFactory( String fileName){
        if( null == sqlSessionFactory ){
             
            try {
                InputStream is = Resources.getResourceAsStream(fileName);
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
         
        return sqlSessionFactory;
    }
     
    public static SqlSession openSession(){
        return getSqlSessionFactory().openSession();
    }
     
    private static SqlSessionFactory sqlSessionFactory;
}