package com.fy.taotao.vo;

import java.io.Serializable;

/**
 * Created by ya.fang on 2017/10/13.
 */
public class EasyUITreeNodeVo implements Serializable {
    private static final long serialVersionUID = -6447728415921475449L;

    private Long id;   //对应商品类目表的id
    private String text;  //对应商品类目表的name
    private String state;  //对应商品类目表的is_parent

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
