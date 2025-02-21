package com.itbaizhan.springbootandmybatisdemo1.service.impl;

import com.itbaizhan.springbootandmybatisdemo1.domain.Login;
import com.itbaizhan.springbootandmybatisdemo1.mapper.LoginMapper;
import com.itbaizhan.springbootandmybatisdemo1.service.ILoginService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author pxb
 * @since 02-21
 */
@Service
public class LoginServiceImpl extends ServiceImpl<LoginMapper, Login> implements ILoginService {

}
