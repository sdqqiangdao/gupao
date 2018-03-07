package org.gupao.study.pattern.chapter.factory.method;

import org.gupao.study.pattern.chapter.factory.JDMarket;
import org.gupao.study.pattern.chapter.factory.Market;

/**
 * Created by shen on 2018/3/6.
 */
public class JDMarketFactory implements MethodMarketFactory {
    @Override
    public Market getMarket() {
        return new JDMarket();
    }
}
