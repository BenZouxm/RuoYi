package com.ruoyi.system.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.system.domain.VgHostCapacity;
import com.ruoyi.system.service.IVgHostCapacityService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 主机容量Controller
 * 
 * @author BenZou
 * @date 2020-10-10
 */
@Controller
@RequestMapping("/systemInfo/capacity")
public class VgHostCapacityController extends BaseController
{
    private String prefix = "systemInfo/capacity";

    @Autowired
    private IVgHostCapacityService vgHostCapacityService;

    @RequiresPermissions("systemInfo:capacity:view")
    @GetMapping()
    public String capacity()
    {
        return prefix + "/capacity";
    }

    /**
     * 查询主机容量列表
     */
    @RequiresPermissions("systemInfo:capacity:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(VgHostCapacity vgHostCapacity)
    {
        startPage();
        List<VgHostCapacity> list = vgHostCapacityService.selectVgHostCapacityList(vgHostCapacity);
        return getDataTable(list);
    }

    /**
     * 导出主机容量列表
     */
    @RequiresPermissions("systemInfo:capacity:export")
    @Log(title = "主机容量", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(VgHostCapacity vgHostCapacity)
    {
        List<VgHostCapacity> list = vgHostCapacityService.selectVgHostCapacityList(vgHostCapacity);
        ExcelUtil<VgHostCapacity> util = new ExcelUtil<VgHostCapacity>(VgHostCapacity.class);
        return util.exportExcel(list, "capacity");
    }

    /**
     * 新增主机容量
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存主机容量
     */
    @RequiresPermissions("systemInfo:capacity:add")
    @Log(title = "主机容量", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(VgHostCapacity vgHostCapacity)
    {
        return toAjax(vgHostCapacityService.insertVgHostCapacity(vgHostCapacity));
    }

    /**
     * 修改主机容量
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") String id, ModelMap mmap)
    {
        VgHostCapacity vgHostCapacity = vgHostCapacityService.selectVgHostCapacityById(id);
        mmap.put("vgHostCapacity", vgHostCapacity);
        return prefix + "/edit";
    }

    /**
     * 修改保存主机容量
     */
    @RequiresPermissions("systemInfo:capacity:edit")
    @Log(title = "主机容量", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(VgHostCapacity vgHostCapacity)
    {
        return toAjax(vgHostCapacityService.updateVgHostCapacity(vgHostCapacity));
    }

    /**
     * 删除主机容量
     */
    @RequiresPermissions("systemInfo:capacity:remove")
    @Log(title = "主机容量", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(vgHostCapacityService.deleteVgHostCapacityByIds(ids));
    }
}
