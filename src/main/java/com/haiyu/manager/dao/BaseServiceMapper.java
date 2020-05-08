package com.haiyu.manager.dao;


import com.haiyu.manager.dto.ServiceDTO;
import com.haiyu.manager.pojo.BaseService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mapper.MyMapper;

import java.util.List;

@Repository
public interface BaseServiceMapper extends MyMapper<BaseService> {

    List<ServiceDTO> getServiceList(ServiceDTO serviceDTO);

    ServiceDTO selectBykey(@Param("id") Integer id);

    int updateBykey(BaseService baseService);
}