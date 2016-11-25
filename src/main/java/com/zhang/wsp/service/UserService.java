package com.zhang.wsp.service;

import com.zhang.wsp.model.User;

import java.util.List;
/**
 * Created by zhang on 2016/11/25.
 */
public interface UserService {
    List<User> getAllUser();

    User getUserByPhoneOrEmail(String emailOrPhone, Short state);

    User getUserById(Long userId);
}
