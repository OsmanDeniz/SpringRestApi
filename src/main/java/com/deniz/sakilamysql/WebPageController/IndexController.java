package com.deniz.sakilamysql.WebPageController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {
    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String index() {
        return "index.html";
    }
}
