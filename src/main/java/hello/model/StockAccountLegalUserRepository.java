package hello.model;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface StockAccountLegalUserRepository extends CrudRepository<StockAccountLegalUser, Integer> {
    @Transactional
    @Modifying
    @Query("delete from StockAccountLegalUser p where p.account_id = ?1")
    void deleteByAccountID(String account_id);

    @Query(value = "select p from StockAccountLegalUser p where p.account_id = ?1")
    List<StockAccountLegalUser> findByAccountId(String account_id);

    @Query(value = "select p from StockAccountLegalUser p where p.legal_num = ?1")
    List<StockAccountLegalUser> findByLegal_num(String legal_num);

}
