package cache.algorithms;

import java.util.Collections;
import java.util.Date;

/**
 * Класс стратегии кеширования "Вытеснение давно неиспользуемых".
 * @autor DariaFilateva
 */
public class LRU <K> extends CacheAlogoritm <K, Date> {

    @Override
    protected Date getKeyDataToRemove() {
        return Collections.min(this.useInfoMap.values());
    }

    @Override
    protected Date getDefaultKeyData() {
        return new Date();
    }
}
