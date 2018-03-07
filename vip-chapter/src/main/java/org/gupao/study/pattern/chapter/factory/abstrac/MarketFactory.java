package org.gupao.study.pattern.chapter.factory.abstrac;

import org.gupao.study.pattern.chapter.factory.JDMarket;
import org.gupao.study.pattern.chapter.factory.Market;
import org.gupao.study.pattern.chapter.factory.TMailMarket;

/**
 * Created by shen on 2018/3/6.
 */
public class MarketFactory extends AbstractMarketFactory {

    @Override
    protected <T extends Market> T getMarket(Class<T> clazz) {
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public TMailMarket getTMailMarket() {
        return getMarket(TMailMarket.class);
    }

    @Override
    public JDMarket getJDMarket() {
        return getMarket(JDMarket.class);
    }
}
