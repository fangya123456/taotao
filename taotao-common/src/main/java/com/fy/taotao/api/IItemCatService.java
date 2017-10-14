package com.fy.taotao.api;

import com.fy.taotao.vo.EasyUITreeNodeVo;

import java.util.List;

/**
 * Created by ya.fang on 2017/10/13.
 */
public interface IItemCatService {

    List<EasyUITreeNodeVo> getItemCatList(long parentId);
}
