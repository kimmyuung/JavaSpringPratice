package pratice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/")
    public String main() {return "main";}

    @GetMapping("/day01/index01")
    public String day01() {return "day01/day01";}

    @GetMapping("/day01/usejpa")
    public String usejpa() {return "day01/usejpa";}

    @GetMapping("/day01/usedao")
    public String useDao() {return "day01/usedao";}

    @GetMapping("/day01/usemybatis")
    public String usemybentics() {return "day01/usemybatis";}



}
