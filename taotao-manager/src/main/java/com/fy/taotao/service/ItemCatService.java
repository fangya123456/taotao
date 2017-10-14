package com.fy.taotao.service;

import com.fy.taotao.api.IItemCatService;
import com.fy.taotao.dao.TbItemCatMapper;
import com.fy.taotao.pojos.TbItemCat;
import com.fy.taotao.pojos.TbItemCatExample;
import com.fy.taotao.vo.EasyUITreeNodeVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ya.fang on 2017/10/13.
 */
@Service
public class ItemCatService implements IItemCatService {

    @Autowired
    private TbItemCatMapper tbItemCatMapper;

    @Override
    public List<EasyUITreeNodeVo> getItemCatList(long parentId) {
        //根据商品类目父节点id查询子节点列表
        TbItemCatExample example = new TbItemCatExample();
        example.createCriteria().andParentIdEqualTo(parentId);
        List<TbItemCat> itemCatList = tbItemCatMapper.selectByExample(example);
        //转换成EasyUITreeNode列表
        List<EasyUITreeNodeVo> resultList = new ArrayList<EasyUITreeNodeVo>();
        itemCatList.forEach(tbItemCat -> {
            EasyUITreeNodeVo node = new EasyUITreeNodeVo();
            node.setId(tbItemCat.getId());
            node.setText(tbItemCat.getName());
            /**
            * 判断该节点下是否有子节点，若有，则置为“closed”；反之若无，则置为“open”
            * */
            node.setState(tbItemCat.getIsParent()==1? "closed":"open");
            resultList.add(node);
        });
        return resultList;
    }
}
