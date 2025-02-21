package com.itbaizhan.springbootandmybatisdemo1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itbaizhan.springbootandmybatisdemo1.domain.Login;
import com.itbaizhan.springbootandmybatisdemo1.service.LoginService;
import com.itbaizhan.springbootandmybatisdemo1.mapper.LoginMapper;
import org.springframework.stereotype.Service;

/**
* @author 86177
* @description 针对表【login】的数据库操作Service实现
* @createDate 2025-02-21 20:16:12
*/
@Service
public class LoginServiceImpl extends ServiceImpl<LoginMapper, Login>
    implements LoginService{

}




