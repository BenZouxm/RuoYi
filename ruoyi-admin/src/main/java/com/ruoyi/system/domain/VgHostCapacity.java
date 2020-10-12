package com.ruoyi.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 主机容量对象 vg_host_capacity
 * 
 * @author BenZou
 * @date 2020-10-10
 */
public class VgHostCapacity extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主机组 */
    @Excel(name = "主机组")
    private String groupName;

    /** Ip地址 */
    @Excel(name = "Ip地址")
    private String ip;

    /** HostName */
    @Excel(name = "HostName")
    private String hostName;

    /** CPU核心数 */
    @Excel(name = "CPU核心数")
    private Long cpuNums;

    /** cpu利用率（%） */
    @Excel(name = "cpu利用率", readConverterExp = "%=")
    private Long cpuUtil;

    /** 内存容量（G） */
    @Excel(name = "内存容量", readConverterExp = "G=")
    private String memTotal;

    /** 内存使用率（%） */
    @Excel(name = "内存使用率", readConverterExp = "%=")
    private Long memUtil;

    /** 主键Id */
    private String id;

    public void setGroupName(String groupName) 
    {
        this.groupName = groupName;
    }

    public String getGroupName() 
    {
        return groupName;
    }
    public void setIp(String ip) 
    {
        this.ip = ip;
    }

    public String getIp() 
    {
        return ip;
    }
    public void setHostName(String hostName) 
    {
        this.hostName = hostName;
    }

    public String getHostName() 
    {
        return hostName;
    }
    public void setCpuNums(Long cpuNums) 
    {
        this.cpuNums = cpuNums;
    }

    public Long getCpuNums() 
    {
        return cpuNums;
    }
    public void setCpuUtil(Long cpuUtil) 
    {
        this.cpuUtil = cpuUtil;
    }

    public Long getCpuUtil() 
    {
        return cpuUtil;
    }
    public void setMemTotal(String memTotal) 
    {
        this.memTotal = memTotal;
    }

    public String getMemTotal() 
    {
        return memTotal;
    }
    public void setMemUtil(Long memUtil) 
    {
        this.memUtil = memUtil;
    }

    public Long getMemUtil() 
    {
        return memUtil;
    }
    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("groupName", getGroupName())
            .append("ip", getIp())
            .append("hostName", getHostName())
            .append("cpuNums", getCpuNums())
            .append("cpuUtil", getCpuUtil())
            .append("memTotal", getMemTotal())
            .append("memUtil", getMemUtil())
            .append("updateTime", getUpdateTime())
            .append("id", getId())
            .toString();
    }
}
