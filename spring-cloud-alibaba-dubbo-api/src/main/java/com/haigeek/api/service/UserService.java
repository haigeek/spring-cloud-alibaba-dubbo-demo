package com.haigeek.api.service;

import java.util.Collection;

/**
 * @author zhaohj
 * @date 2020-02-11 09:41
 */
public interface UserService {

    boolean save(User user);

    boolean remove(Long userId);

    Collection<User> findAll();
}
