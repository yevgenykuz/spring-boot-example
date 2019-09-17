package me.yevgeny.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yevgeny Kuznetsov
 * @since 0.0.1, 17 September 2019
 **/
@RestController
public class ExampleController {

    @RequestMapping(value = "/")
    public String welcomeMessage() {
        return "Spring boot is awesome";
    }
}
