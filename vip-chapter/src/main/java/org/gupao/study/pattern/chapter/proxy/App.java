package org.gupao.study.pattern.chapter.proxy;

import org.gupao.study.pattern.chapter.proxy.cglib.CglibHandler;
import org.gupao.study.pattern.chapter.proxy.jdk.JdkHandler;
import org.junit.Test;

/**
 * @author shen
 * @create 2018-04-01 10:31
 * @desc
 **/
public class App {

    @Test
    public void JDK() {
        IUserService service = (IUserService)new JdkHandler(new UserServiceImpl()).getInstance();
        service.add();
    }

    @Test
    public void CGLIB() {
        UserServiceImpl service = (UserServiceImpl)new CglibHandler(new UserServiceImpl()).getInstance();
        service.delete();
        //System.out.println(service);
    }
}
