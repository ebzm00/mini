package io.goorm.mini.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model) throws Exception {

        //model.addAttribute("resultList", sampleService.selectSampleList(SampleVO));

        return "index";
    }
}
