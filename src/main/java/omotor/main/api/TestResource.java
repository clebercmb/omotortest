package omotor.main.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class TestResource {
	@RequestMapping("/")
    String get() {
        //mapped to hostname:port/home/
        return "Hello from get";
    }
    @RequestMapping("/index")
    String index() {
        //mapped to hostname:port/home/index/
        return "Hello from index";
    }
}
