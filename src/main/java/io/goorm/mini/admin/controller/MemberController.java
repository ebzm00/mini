package io.goorm.mini.admin.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/admin")
public class MemberController {

    // 리스트
    @GetMapping("/members")
    public String list(Model model) {

        return "admin/member/list";
    }

    // 뷰
    @GetMapping("/members/{memberId}")
    public String view(@PathVariable Long memberSeq, Model model) {

        return "admin/member/view";
    }

}