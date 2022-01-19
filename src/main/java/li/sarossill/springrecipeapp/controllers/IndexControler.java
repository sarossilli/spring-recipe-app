package li.sarossill.springrecipeapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;

public class IndexControler {

    @RequestMapping({"","/","/index","/home"})
    public String getIndex(){
        return "index";
    }
}
