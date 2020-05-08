package com.haiyu.manager.dto;


import lombok.Data;

/**
 * @Title: UserSearchDTO
 * @Description:
 * @author: youqing
 * @version: 1.0
 * @date: 2018/11/21 11:19
 */
@Data
public class ServiceDTO {
    private Integer id;
    private String name;
    private String state;
    private String type;
    private String ip;
    private String modelType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }
}
