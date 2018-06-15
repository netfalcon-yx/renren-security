package io.renren.modules.industrial.controller;

import java.util.Arrays;
import java.util.Map;

import io.renren.common.validator.ValidatorUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.modules.industrial.entity.IndustrialHouseLeaselogEntity;
import io.renren.modules.industrial.service.IndustrialHouseLeaselogService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 租赁记录
 *
 * @author yangxuan
 * @email netfalcon@gmail.com
 * @date 2018-06-14 15:27:22
 */
@RestController
@RequestMapping("industrial/industrialhouseleaselog")
public class IndustrialHouseLeaselogController {
    @Autowired
    private IndustrialHouseLeaselogService industrialHouseLeaselogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("industrial:industrialhouseleaselog:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = industrialHouseLeaselogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{leaseId}")
    @RequiresPermissions("industrial:industrialhouseleaselog:info")
    public R info(@PathVariable("leaseId") Long leaseId){
        IndustrialHouseLeaselogEntity industrialHouseLeaselog = industrialHouseLeaselogService.selectById(leaseId);

        return R.ok().put("industrialHouseLeaselog", industrialHouseLeaselog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("industrial:industrialhouseleaselog:save")
    public R save(@RequestBody IndustrialHouseLeaselogEntity industrialHouseLeaselog){
        industrialHouseLeaselogService.insert(industrialHouseLeaselog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("industrial:industrialhouseleaselog:update")
    public R update(@RequestBody IndustrialHouseLeaselogEntity industrialHouseLeaselog){
        ValidatorUtils.validateEntity(industrialHouseLeaselog);
        industrialHouseLeaselogService.updateAllColumnById(industrialHouseLeaselog);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("industrial:industrialhouseleaselog:delete")
    public R delete(@RequestBody Long[] leaseIds){
        industrialHouseLeaselogService.deleteBatchIds(Arrays.asList(leaseIds));

        return R.ok();
    }

}
