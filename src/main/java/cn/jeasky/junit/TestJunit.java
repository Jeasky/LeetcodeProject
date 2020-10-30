package cn.jeasky.junit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @program: LeetcodeProject
 * @description: 测试Junit
 * @author: Jeasky
 * @create: 2020-10-30 10:33
 **/
public class TestJunit {
    private static final Logger logger = Logger.getLogger(TestJunit.class);

    @Before
    public void testbefore(){
        System.out.println("this is before!");
    }

    @After
    public void testafter(){
        System.out.println("this is after!");
    }

    @Test
    public void test1(){
//        //使用默认的配置信息，不需要写log4j.properties
//        BasicConfigurator.configure();
//        //设置日志输出级别为info，这将覆盖配置文件中设置的级别
//        logger.setLevel(Level.INFO);
        //下面的消息将被输出
        logger.trace("this is a trace");
        logger.info("this is an info");
        logger.warn("this is a warn");
        logger.error("this is an error");
        logger.fatal("this is a fatal");
    }
}
