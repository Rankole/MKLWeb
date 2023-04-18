package com.izejs.simple.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.izejs.simple.entity.MaintenanceWorker;
import com.izejs.simple.dto.MaintenanceWorkerDTO;

import java.util.List;

public interface IMaintenanceWorkerService extends IService<MaintenanceWorker> {
    IPage<MaintenanceWorker> getAllMaintenanceWorker(Page page, MaintenanceWorkerDTO maintenanceWorker);

    List<MaintenanceWorker> getMaintenanceWorkerList();
}
