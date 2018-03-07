package org.gupao.study.pattern.chapter.factory.abstrac;

import org.gupao.study.pattern.chapter.factory.JDMarket;
import org.gupao.study.pattern.chapter.factory.Market;
import org.gupao.study.pattern.chapter.factory.TMailMarket;

/**
 * Created by shen on 2018/3/6.
 */
public abstract class AbstractMarketFactory {

    protected abstract <T extends Market> T getMarket(Class<T> clazz);

    public abstract TMailMarket getTMailMarket();

    public abstract JDMarket getJDMarket();

}
