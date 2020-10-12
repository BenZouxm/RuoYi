package com.ruoyi.system.service.impl;

import java.util.List;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.system.mapper.VgHostCapacityMapper;
import com.ruoyi.system.domain.VgHostCapacity;
import com.ruoyi.system.service.IVgHostCapacityService;
import com.ruoyi.common.core.text.Convert;

/**
 * 主机容量Service业务层处理
 * 
 * @author BenZou
 * @date 2020-10-10
 */
@Service
public class VgHostCapacityServiceImpl implements IVgHostCapacityService 
{
    @Autowired
    private VgHostCapacityMapper vgHostCapacityMapper;

    /**
     * 查询主机容量
     * 
     * @param id 主机容量ID
     * @return 主机容量
     */
    @Override
    public VgHostCapacity selectVgHostCapacityById(String id)
    {
        return vgHostCapacityMapper.selectVgHostCapacityById(id);
    }

    /**
     * 查询主机容量列表
     * 
     * @param vgHostCapacity 主机容量
     * @return 主机容量
     */
    @Override
    public List<VgHostCapacity> selectVgHostCapacityList(VgHostCapacity vgHostCapacity)
    {
        return vgHostCapacityMapper.selectVgHostCapacityList(vgHostCapacity);
    }

    /**
     * 新增主机容量
     * 
     * @param vgHostCapacity 主机容量
     * @return 结果
     */
    @Override
    public int insertVgHostCapacity(VgHostCapacity vgHostCapacity)
    {
        return vgHostCapacityMapper.insertVgHostCapacity(vgHostCapacity);
    }

    /**
     * 修改主机容量
     * 
     * @param vgHostCapacity 主机容量
     * @return 结果
     */
    @Override
    public int updateVgHostCapacity(VgHostCapacity vgHostCapacity)
    {
        vgHostCapacity.setUpdateTime(DateUtils.getNowDate());
        return vgHostCapacityMapper.updateVgHostCapacity(vgHostCapacity);
    }

    /**
     * 删除主机容量对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteVgHostCapacityByIds(String ids)
    {
        return vgHostCapacityMapper.deleteVgHostCapacityByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除主机容量信息
     * 
     * @param id 主机容量ID
     * @return 结果
     */
    @Override
    public int deleteVgHostCapacityById(String id)
    {
        return vgHostCapacityMapper.deleteVgHostCapacityById(id);
    }
}
