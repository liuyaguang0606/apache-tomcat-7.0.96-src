package org.apache.catalina.yycext;

import org.apache.catalina.connector.Request;
import org.apache.catalina.connector.Response;
import org.apache.catalina.valves.ValveBase;

import javax.servlet.ServletException;
import java.io.IOException;

/**
 *
 * 自定义valve
 *
 * @author yaoyucai
 * @date 2021/12/26 18:10
 */
public class PrintIPValve extends ValveBase {

    @Override
    public void invoke(Request request, Response response) throws IOException, ServletException {
        System.out.println("My Valve============:" + request.getRemoteAddr());
        getNext().invoke(request, response);
    }
}
