package shop.mtcoding.onebin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    @GetMapping("/board")
    public String index() {
        return "board/index";
    }
}
