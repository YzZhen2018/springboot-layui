package com.haiyu.manager.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.haiyu.manager.dao.BaseServiceMapper;
import com.haiyu.manager.dto.AdminUserDTO;
import com.haiyu.manager.dto.ServiceDTO;
import com.haiyu.manager.dto.UserSearchDTO;
import com.haiyu.manager.pojo.BaseService;
import com.haiyu.manager.response.PageDataResult;
import com.haiyu.manager.service.ServiceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * by yz
 */
@Service
public class ServiceServiceImpl implements ServiceService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BaseServiceMapper baseServiceMapper;


    @Override
    public PageDataResult getServiceList(ServiceDTO serviceDTO, Integer pageNum, Integer pageSize) {
        PageDataResult pageDataResult = new PageDataResult();
        List<ServiceDTO> baseServiceDTOs = baseServiceMapper.getServiceList(serviceDTO);
        PageHelper.startPage(pageNum, pageSize);

        if(baseServiceDTOs.size() != 0){
            PageInfo<ServiceDTO> pageInfo = new PageInfo<>(baseServiceDTOs);
            pageDataResult.setList(baseServiceDTOs);
            pageDataResult.setTotals((int) pageInfo.getTotal());
        }
        return pageDataResult;
    }

    @Override
    public ServiceDTO selectBykey(Integer id) {
        return baseServiceMapper.selectBykey(id);
    }

    @Override
    public int updateBykey(BaseService baseService) {
        return baseServiceMapper.updateBykey(baseService);
    }
}
