import com.caucho.hessian.client.HessianProxyFactory;
import com.lich.BasicAPI;

import java.net.MalformedURLException;

/**
 * Created by yangzhang on 12/10/2014.
 */
public class Client {
    public static void main(String[] args) throws MalformedURLException {
        String url = "http://localhost:8080/basic";

        HessianProxyFactory factory = new HessianProxyFactory();
        BasicAPI basic = (BasicAPI) factory.create(BasicAPI.class, url);

        System.out.println("hello(): " + basic.hello());
    }
}
