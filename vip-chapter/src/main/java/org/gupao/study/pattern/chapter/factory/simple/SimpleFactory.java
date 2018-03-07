package org.gupao.study.pattern.chapter.factory.simple;

import org.gupao.study.pattern.chapter.factory.JDMarket;
import org.gupao.study.pattern.chapter.factory.Market;
import org.gupao.study.pattern.chapter.factory.TMailMarket;

/**
 * Created by shen on 2018/3/6.
 */
public class SimpleFactory {

    public Market getMarket(String marketName) {
        if ("天猫".equals(marketName)) {
            return new TMailMarket();
        }
        if ("京东".equals(marketName)) {
            return new JDMarket();
        }
        return null;
    }
}
