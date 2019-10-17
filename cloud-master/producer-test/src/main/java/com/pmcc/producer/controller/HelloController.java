package com.pmcc.producer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author
 * @Description
 * @date 2019-09-26 11:58
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String index(String name,HttpServletRequest request) {
        String url = request.getRequestURI() == null ? "" : request.getRequestURI() ;
        String referer = request.getHeader("referer") == null ? "" : request.getHeader("referer") ;
        return "hello "+name+",welcome! url=" + url + " referer=" + referer;
    }
}

