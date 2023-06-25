package sia.tacos.data;

import sia.tacos.TacoOrder;

public interface OrderRepository {
    
    TacoOrder save(TacoOrder order);
}
