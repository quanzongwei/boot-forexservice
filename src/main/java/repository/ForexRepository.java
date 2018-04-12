package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import domain.Exchange;


/**
 * Created by quanzongwei(207127) on 2018/4/11 0011.
 */
@Repository
public interface ForexRepository extends JpaRepository<Exchange,Long> {
    public Exchange findFirstByCurrencyFromAndCurrencyTo(String from, String to);
}
