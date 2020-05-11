package com.haiyu.manager.controller.system;

import com.haiyu.manager.dto.ServiceDTO;
import com.haiyu.manager.dto.UserSearchDTO;
import com.haiyu.manager.pojo.ServiceTypeEnum;
import com.haiyu.manager.response.PageDataResult;
import com.haiyu.manager.service.ServiceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Title: UserController
 * @Description: 服务器管理
 * @author: youqing
 * @version: 1.0
 * @date: 2018/11/20 15:17
 */
@Controller
@RequestMapping("service")
public class ServiceController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ServiceService serviceService;

    /**
     *
     * 功能描述: 实例列表
     *
     * @param:
     * @return:
     * @auther: youqing
     * @date: 2018/11/21 13:50
     */
    @RequestMapping("/serviceManage")
    public String serviceManage() {
        return "/service/serviceManage";
    }

    /**
     *
     * 功能描述: 分页查询服务器列表
     *
     * @param:
     * @return:
     * @auther: youqing
     * @date: 2018/11/21 11:10
     */
    @RequestMapping(value = "/getServiceList", method = RequestMethod.POST)
    @ResponseBody
    public PageDataResult getServiceList(@RequestParam("pageNum") Integer pageNum,
                                      @RequestParam("pageSize") Integer pageSize,/*@Valid PageRequest page,*/ ServiceDTO serviceDTO) {
        /*logger.info("分页查询用户列表！搜索条件：userSearch：" + userSearch + ",pageNum:" + page.getPageNum()
                + ",每页记录数量pageSize:" + page.getPageSize());*/
        PageDataResult pdr = new PageDataResult();
        try {
            if(null == pageNum) {
                pageNum = 1;
            }
            if(null == pageSize) {
                pageSize = 10;
            }
            // 获取用户列表
            pdr = serviceService.getServiceList(serviceDTO, pageNum ,pageSize);
            logger.info("服务器列表查询=pdr:" + pdr);

        } catch (Exception e) {
            e.printStackTrace();
            logger.error("服务器列表查询异常！", e);
        }
        return pdr;
    }


    /**
     *
     * 更换系统盘
     * @param:
     * @return:
     * @auther: youqing
     * @date: 2018/11/22 11:59
     */
    @RequestMapping(value = "/updateSystem", method = RequestMethod.PUT)
    @ResponseBody
    public Map<String, Object> updateUserStatus(@RequestParam("id") Integer id,@RequestParam("type") String type ) {
        logger.info("更换系统盘id:" + id+" type:"+type);
        Map<String, Object> data = new HashMap<>();
        if(type.equals(ServiceTypeEnum.WINDOWSSERVER2008.getType())){

        }else if (type.equals(ServiceTypeEnum.WINDOWSSERVER2012.getType())) {

        }else if (type.equals(ServiceTypeEnum.WINDOWSSERVER2016.getType())) {

        }else if (type.equals(ServiceTypeEnum.CENTOS.getType())) {

        }
        return data;
    }



    /**
     *
     * 实例开关机，重启
     * @param:
     * @return:
     * @auther: youqing
     * @date: 2018/11/22 11:59
     */
    @RequestMapping(value = "/startingUpOrShutdown", method = RequestMethod.PUT)
    @ResponseBody
    public Map<String, Object> startingUpOrShutdown(@RequestParam("id") Integer id,@RequestParam("status") Integer status) {
        logger.info("实例开关机，重启！id:" + id+" status:"+status);
        Map<String, Object> data = new HashMap<>();
        if(status == 0){
            //开机
        }else if (status == 1) {
            //关机
        }else {
            //重启
        }
        return data;
    }

}
