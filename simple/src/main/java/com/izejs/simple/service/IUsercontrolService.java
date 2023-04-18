package com.izejs.simple.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.izejs.simple.entity.Usercontrol;
import com.izejs.simple.dto.UsercontrolDTO;

import java.util.List;

public interface IUsercontrolService extends IService<Usercontrol>{
        IPage<Usercontrol> getAllUsercontrol(Page page, UsercontrolDTO usercontrol);

        List<Usercontrol> getUsercontrolList();
}
