package com.fy.taotao.api;

import com.fy.taotao.vo.TestUserVo;

/**
 * Created by ya.fang on 2017/10/11.
 */
public interface ITestUserService {

    TestUserVo selectByPrimaryKey(Long id);
}
