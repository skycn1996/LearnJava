import com.wxl.context.ApplicationContext;
import com.wxl.context.impl.ClassPathXmlApplicationContext;
import com.wxl.entity.Address;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Address address = (Address) applicationContext.getBean("address");
        System.out.println(address);
    }
}

