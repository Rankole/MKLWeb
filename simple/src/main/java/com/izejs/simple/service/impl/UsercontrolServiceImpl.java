package com.izejs.simple.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.izejs.simple.entity.Usercontrol;
import com.izejs.simple.mapper.UsercontrolMapper;
import com.izejs.simple.dto.UsercontrolDTO;
import com.izejs.simple.service.IUsercontrolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsercontrolServiceImpl extends
        ServiceImpl<UsercontrolMapper, Usercontrol>
        implements IUsercontrolService{


    @Autowired
    private UsercontrolMapper usercontrolMapper;

    //查询所有用户
    @Override
    public IPage<Usercontrol> getAllUsercontrol(Page page, UsercontrolDTO usercontrol) {
        LambdaQueryWrapper<Usercontrol> queryWrapper = new LambdaQueryWrapper<>();

        if(usercontrol.getUserName() != null && !"".equals(usercontrol.getUserName())){
            queryWrapper = queryWrapper.like(Usercontrol::getUserName, usercontrol.getUserName());
        }
        if(usercontrol.getUserNc() != null && !"".equals(usercontrol.getUserNc())){
            queryWrapper = queryWrapper.like(Usercontrol::getUserNc, usercontrol.getUserNc());
        }

        return usercontrolMapper.selectPage(page, queryWrapper);
    }
    @Override
    public List<Usercontrol> getUsercontrolList() {
        return usercontrolMapper.selectList(null);
    }
}
