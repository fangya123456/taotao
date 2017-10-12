package com.fy.taotao.service;

import com.fy.taotao.api.ITestUserService;
import com.fy.taotao.dao.TestUserMapper;
import com.fy.taotao.vo.TestUserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ya.fang on 2017/10/11.
 */
@Service
public class TestUserService implements ITestUserService {

    @Autowired
    private TestUserMapper testUserMapper;

    public TestUserVo selectByPrimaryKey(Long id){
        TestUserVo testUserVo = new TestUserVo();
        BeanUtils.copyProperties(testUserMapper.selectByPrimaryKey(id), testUserVo);
        return  testUserVo;
    }
}
