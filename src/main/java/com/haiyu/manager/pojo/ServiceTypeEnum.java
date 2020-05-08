package com.haiyu.manager.pojo;

/**
 * 系统盘类型
 */
public enum ServiceTypeEnum {
    WINDOWSSERVER2008(1,"WindowsServer2008"),
    WINDOWSSERVER2012(2,"WindowsServer2012"),
    WINDOWSSERVER2016(3,"WindowsServer2016"),
    CENTOS(4,"CENTOS7.2")
    ;

    private int type;

    private String desc;

    ServiceTypeEnum(int type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
