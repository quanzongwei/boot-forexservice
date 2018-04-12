package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import domain.Exchange;
import repository.ForexRepository;


/**
 * Created by quanzongwei(207127) on 2018/4/11 0011.
 */
@RestController
@RequestMapping("/forex")
public class ForexController {
    @Autowired
    Environment environment;

    @Autowired
    ForexRepository forexRepository;

    /**
     * jdbc:h2:mem:testdb
     * /forex/f/USD/t/INR
     */
    @RequestMapping(value = "/f/{from}/t/{to}", method = RequestMethod.GET)
    public Exchange hello(HttpServletRequest request, @PathVariable(name = "from") String from, @PathVariable(name = "to") String to) {
        Exchange one = forexRepository.findFirstByCurrencyFromAndCurrencyTo(from, to);
        // System.out.println(Integer.valueOf(environment.getProperty("local.sever.port")));
        System.out.println(environment.getProperty("local.server.port"));
        return one;

    }
}
