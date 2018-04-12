package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Created by quanzongwei(207127) on 2018/4/11 0011.
 */
@RestController
@RequestMapping("hello")
@SessionAttributes
public class HelloController {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public void hello(HttpServletRequest request) {
        System.out
                .println("hello world ");
    }
}
