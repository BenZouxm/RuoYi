package com.ruoyi.system.service;

import java.util.List;
import com.ruoyi.system.domain.VgHostCapacity;

/**
 * 主机容量Service接口
 * 
 * @author BenZou
 * @date 2020-10-10
 */
public interface IVgHostCapacityService 
{
    /**
     * 查询主机容量
     * 
     * @param id 主机容量ID
     * @return 主机容量
     */
    public VgHostCapacity selectVgHostCapacityById(String id);

    /**
     * 查询主机容量列表
     * 
     * @param vgHostCapacity 主机容量
     * @return 主机容量集合
     */
    public List<VgHostCapacity> selectVgHostCapacityList(VgHostCapacity vgHostCapacity);

    /**
     * 新增主机容量
     * 
     * @param vgHostCapacity 主机容量
     * @return 结果
     */
    public int insertVgHostCapacity(VgHostCapacity vgHostCapacity);

    /**
     * 修改主机容量
     * 
     * @param vgHostCapacity 主机容量
     * @return 结果
     */
    public int updateVgHostCapacity(VgHostCapacity vgHostCapacity);

    /**
     * 批量删除主机容量
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteVgHostCapacityByIds(String ids);

    /**
     * 删除主机容量信息
     * 
     * @param id 主机容量ID
     * @return 结果
     */
    public int deleteVgHostCapacityById(String id);
}
