package com.izejs.simple.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.api.R;
import com.izejs.simple.dto.UsercontrolDTO;
import com.izejs.simple.entity.Usercontrol;
import com.izejs.simple.service.IUsercontrolService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Arrays;
import java.util.List;


@Controller
public class UsercontrolController {

    @Resource
    private IUsercontrolService usercontrolService;

    //查询所有
    @GetMapping("/api/getUsercontrolList")
    @ResponseBody
    public R getUsercontrolList(HttpSession session, UsercontrolDTO usercontrolDTO, Page page){

        IPage<Usercontrol> usercontrolPage = usercontrolService.getAllUsercontrol(page, usercontrolDTO);
        return R.ok(usercontrolPage);
    }

    //获取列表
    @GetMapping("/api/getWorkers")
    @ResponseBody
    public R getWorkers(){
        List<Usercontrol> maintenanceWorkerList = usercontrolService.getUsercontrolList();
        return R.ok(maintenanceWorkerList);
    }
}
