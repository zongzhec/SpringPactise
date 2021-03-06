package foo.zongzhe.spring_prac;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Test
    public void testAdd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testUserSet() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        User user = context.getBean("user2", User.class);
        System.out.println(user);
        user.add();
    }

    @Test
    public void testUserWithConstructor() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        User user = context.getBean("user3", User.class);
        System.out.println(user);
        user.add();
    }
}
