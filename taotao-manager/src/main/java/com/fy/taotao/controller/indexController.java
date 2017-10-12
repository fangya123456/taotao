package com.fy.taotao.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ya.fang on 2017/10/12.
 */
@Controller
public class indexController {

    private static final Logger log = Logger.getLogger(indexController.class);

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(HttpServletRequest request, Model model){
        log.info("访问淘淘商城后台管理系统首页......");
        return "index";
    }

    @RequestMapping(value = "/{page}", method = RequestMethod.GET)
    public String itemAdd(@PathVariable("page") String page, HttpServletRequest request, Model model){
        log.info("访问淘淘商城后台管理系统模块: "+page);
        return page;
    }
}
