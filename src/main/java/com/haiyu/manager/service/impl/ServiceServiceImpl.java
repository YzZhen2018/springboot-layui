package com.haiyu.manager.service.impl;

import com.haiyu.manager.dao.BaseServiceMapper;
import com.haiyu.manager.dto.ServiceDTO;
import com.haiyu.manager.pojo.BaseService;
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
    public List<ServiceDTO> getServiceList(ServiceDTO serviceDTO) {
        return baseServiceMapper.getServiceList(serviceDTO);
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
