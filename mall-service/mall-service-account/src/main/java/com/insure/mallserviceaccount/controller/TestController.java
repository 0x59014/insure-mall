package com.insure.mallserviceaccount.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1/test")
public class TestController {

    @GetMapping("/tests/{id}")
    public String tests( @PathVariable(value = "id") String id) {

        log.info("========id{}", id);
        // userService.tests();
        //var x = groupService.findGroupByGroupId("67148949");
        //poPService.findPoPInfoByUserId("64f9a8927cead27d9d3e9312");
        return "asdasd";
    }

}
