package com.haiyu.manager.service;

import com.haiyu.manager.dto.ServiceDTO;
import com.haiyu.manager.dto.UserSearchDTO;
import com.haiyu.manager.pojo.BaseAdminUser;
import com.haiyu.manager.pojo.BaseService;
import com.haiyu.manager.response.PageDataResult;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


/**
 * @Title: AdminUserService
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/11/21 11:04
 */
public interface ServiceService {

    PageDataResult getServiceList(ServiceDTO serviceDTO, Integer pageNum, Integer pageSize);

    ServiceDTO selectBykey(@Param("id") Integer id);

    int updateBykey(BaseService baseService);
}
