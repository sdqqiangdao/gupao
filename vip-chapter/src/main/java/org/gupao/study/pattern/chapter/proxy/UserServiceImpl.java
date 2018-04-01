package org.gupao.study.pattern.chapter.proxy;

/**
 * @author shen
 * @create 2018-04-01 10:40
 * @desc
 **/
public class UserServiceImpl implements IUserService {
    public void add() {
        System.out.println("execute method add");
    }

    public void delete() {
        System.out.println("execute method delete");
    }

    public void modify() {
        System.out.println("execute method modify");
    }

    public int query() {
        System.out.println("execute method query");
        return 0;
    }
}
