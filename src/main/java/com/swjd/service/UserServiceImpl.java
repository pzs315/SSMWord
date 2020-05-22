package com.swjd.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.swjd.Mapper.UserMapper;
import com.swjd.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {


}
