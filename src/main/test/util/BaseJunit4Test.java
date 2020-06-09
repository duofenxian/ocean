package util;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * Created by duofx on 2020/6/9.
 * WebAppConfiguration() 设置web项目的环境，如果是Web项目，必须配置该属性，否则无法获取 web 容器相关的信息（request、context 等信息）
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring/spring-*.xml")
@WebAppConfiguration()
public class BaseJunit4Test {
}
