package org.gupao.study.pattern.chapter.factory;

import org.gupao.study.pattern.chapter.factory.abstrac.MarketFactory;
import org.gupao.study.pattern.chapter.factory.method.JDMarketFactory;
import org.gupao.study.pattern.chapter.factory.method.MethodMarketFactory;
import org.gupao.study.pattern.chapter.factory.simple.SimpleFactory;

/**
 * Created by shen on 2018/3/6.
 */
public class App {
    public static void main(String[] args) {

        //简单工厂
        SimpleFactory simpleFactory = new SimpleFactory();
        System.out.println("简单工厂：" + simpleFactory.getMarket("天猫"));

        //工厂方法
        MethodMarketFactory methodMarketFactory = new JDMarketFactory();
        System.out.println("工厂方法：" + methodMarketFactory.getMarket());

        //抽象工厂
        MarketFactory marketFactory = new MarketFactory();
        //System.out.println("抽象工厂：" + marketFactory.getMarket(TMailMarket.class));
        System.out.println("抽象工厂：" + marketFactory.getTMailMarket());
        System.out.println("抽象工厂：" + marketFactory.getJDMarket());
    }
}
