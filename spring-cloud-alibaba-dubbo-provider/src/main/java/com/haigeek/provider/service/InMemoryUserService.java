package com.haigeek.provider.service;

import com.haigeek.api.service.User;
import com.haigeek.api.service.UserService;
import org.apache.dubbo.config.annotation.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaohj
 * @date 2020-02-11 10:56
 */
@Service(protocol = "dubbo")
public class InMemoryUserService implements UserService {
    private Map<Long, User> usersRepository = new HashMap<>();

    @Override
    public boolean save(User user) {
        return usersRepository.put(user.getId(), user) == null;
    }

    @Override
    public boolean remove(Long userId) {
        return usersRepository.remove(userId) != null;
    }

    @Override
    public Collection<User> findAll() {
        return usersRepository.values();
    }
}
