package org.gupao.study.pattern.chapter.factory.method;

import org.gupao.study.pattern.chapter.factory.Market;
import org.gupao.study.pattern.chapter.factory.TMailMarket;

/**
 * Created by shen on 2018/3/6.
 */
public class TMailMarketFactory implements MethodMarketFactory {
    @Override
    public Market getMarket() {
        return new TMailMarket();
    }
}
