package com.fy.taotao.controller;

import com.fy.taotao.api.IItemCatService;
import com.fy.taotao.vo.EasyUITreeNodeVo;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ya.fang on 2017/10/13.
 */
@Controller
@RequestMapping("/item")
public class ItemController {

    private static final Logger log = Logger.getLogger(ItemController.class);

    @Autowired
    private IItemCatService itemCatService;


    //=======================相关API接口操作===========================================
    @ResponseBody
    @RequestMapping(value = "/cat/list",method = RequestMethod.POST)
    public Object getItemCatList(@RequestParam(value = "id",defaultValue = "0")long parentId){
        List<EasyUITreeNodeVo> list = itemCatService.getItemCatList(parentId);
        return list;
    }

}
