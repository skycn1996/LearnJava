import com.wxl.utils.Cal;
import com.wxl.utils.MyInvocationHandler;
import com.wxl.utils.impl.CalImpl;

public class Test {
    public static void main(String[] args) {
//        Cal cal = new CalImpl();
//        cal.add(1,1);
//        cal.sub(2,1);
//        cal.mul(2,3);
//        cal.div(6,2);
        Cal cal = new CalImpl();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();
        Cal proxy = (Cal) myInvocationHandler.bind(cal);
        proxy.add(10,3);
        proxy.sub(10,3);
        proxy.mul(10,3);
        proxy.div(10,3);
    }
}
