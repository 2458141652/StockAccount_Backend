package hello.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface StockAccountBankerRepository extends CrudRepository<StockAccountBanker, Integer> {
    @Query(value = "select p from StockAccountBanker p where p.id = ?1 and p.password = ?2")
    List<StockAccountBanker> getBankerLogin(String id, String password);
    @Query(value = "select p from StockAccountBanker p where p.id = ?1")
    List<StockAccountBanker> getBankerById(String id);
}
