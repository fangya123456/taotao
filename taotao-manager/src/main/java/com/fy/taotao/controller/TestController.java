package com.fy.taotao.controller;

import com.fy.taotao.api.ITestUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by ya.fang on 2017/10/11.
 */
@Controller
public class TestController {

    private static final Logger log = Logger.getLogger(TestController.class);

    @Autowired
    private ITestUserService testUserService;

    @ResponseBody
    @RequestMapping(value = "/testUser/{id}", method = RequestMethod.GET)
    public Object testUser(@PathVariable("id")Long id, HttpServletRequest request, Model model){
        log.info("日志配置正确......");
        return testUserService.selectByPrimaryKey(id);
    }
}
