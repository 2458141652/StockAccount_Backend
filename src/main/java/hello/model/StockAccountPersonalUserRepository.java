package hello.model;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface StockAccountPersonalUserRepository extends CrudRepository<StockAccountPersonalUser, Integer> {
    @Transactional
    @Modifying
    @Query("delete from StockAccountPersonalUser p where p.account_id = ?1")
    void deleteByAccountID(String account_id);

    @Query(value = "select p from StockAccountPersonalUser p where p.account_id = ?1")
    List<StockAccountPersonalUser> findByAccountId(String account_id);

    @Query(value = "select p from StockAccountPersonalUser p where p.Id_num = ?1")
    List<StockAccountPersonalUser> findById_num(String Id_num);
}
