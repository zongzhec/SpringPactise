package foo.zongzhe.spring_prac;

import foo.zongzhe.spring_prac.spring_prac.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void testAdd() {
// 加载Spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 获取配置创建的对象
        User user = context.getBean("user",  User.class);
        System.out.println(user);
        user.add();
    }
}
