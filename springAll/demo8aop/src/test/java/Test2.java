import com.wxl.utils.Cal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        //加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aop.xml");
        //获取代理对象
        Cal cal = (Cal) applicationContext.getBean("calImpl");
        cal.add(10,3);
        cal.sub(10,3);
        cal.mul(10,3);
        cal.div(10,3);
    }
}
