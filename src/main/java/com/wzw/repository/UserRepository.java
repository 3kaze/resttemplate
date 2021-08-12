package com.wzw.repository;

import com.wzw.entity.User;

import java.util.Collection;

/**
 * @author wei
 * @Date 2021/8/13
 */
public interface UserRepository {

    public Collection<User> findAll();
    public User findById(Integer id);
    public void saveOrUpdate(User user);
    public void deleteById(Integer id);
}
