package com.yukong.chapter22;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: xiongping22369
 * @Date: 2018/8/13 17:52
 * @Description: freemark整合
 */
@Controller
public class IndexController {

    @GetMapping("/aboutme")
    public String index(Model model) throws ParseException {
        User user = new User();
        user.setUsername("shangxoliang");
        user.setPassword("admin");
        user.setAge(27);
        user.setSex(1);
        model.addAttribute("user", user);
        return "index";
    }

}
