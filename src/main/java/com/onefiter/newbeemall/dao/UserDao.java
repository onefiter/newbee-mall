package com.onefiter.newbeemall.dao;

import com.onefiter.newbeemall.entity.User;

import java.util.List;

public interface UserDao {

    /**
     * 返回数据列表
     * @return
     */
    List<User> findAllUsers();

    /**
     * 添加
     * @param User
     * @return
     */
    int insertUser(User User);

    /**
     * 修改
     * @param User
     * @return
     */
    int updUser(User User);

    /**
     * 删除
     * @param id
     * @return
     */
    int delUser(Integer id);
}
