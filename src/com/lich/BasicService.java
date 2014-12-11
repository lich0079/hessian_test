package com.lich;

import com.caucho.hessian.server.HessianServlet;

/**
 * Created by yangzhang on 12/10/2014.
 */
public class BasicService extends HessianServlet implements BasicAPI {
    private String _greeting = "Hello, world";

    public void setGreeting(String greeting)
    {
        _greeting = greeting;
    }

    public String hello()
    {
        return _greeting;
    }
}
