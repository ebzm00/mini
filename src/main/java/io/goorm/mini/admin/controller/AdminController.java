package io.goorm.mini.admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/admin")
public class AdminController {

    //리스트
    @GetMapping("/admins")
    public String list(Model model){

        //model.addAttribute("posts",boardService.getBoards());

        return "admin/admin/list";
    }

    //뷰
    @GetMapping("/admins/{adminSeq}")
    public String view(Model model) {

        //model.addAttribute("posts",boardService.getBoards());

        return "admin/admin/view";
    }

    //등록
    @GetMapping("/admins/create")
    public String create(Model model) {

        //model.addAttribute("posts",boardService.getBoards());

        return "admin/admin/create";
    }

    @GetMapping("/admins/modify")
    public String modify(Model model) {

        //model.addAttribute("posts",boardService.getBoards());

        return "admin/admin/modify";
    }

}
