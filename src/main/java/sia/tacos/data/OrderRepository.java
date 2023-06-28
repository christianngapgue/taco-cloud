package sia.tacos.data;

import org.springframework.data.repository.CrudRepository;

import sia.tacos.TacoOrder;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
}
