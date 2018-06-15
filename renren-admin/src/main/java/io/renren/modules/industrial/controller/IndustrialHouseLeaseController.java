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

import io.renren.modules.industrial.entity.IndustrialHouseLeaseEntity;
import io.renren.modules.industrial.service.IndustrialHouseLeaseService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 房屋信息
 *
 * @author yangxuan
 * @email netfalcon@gmail.com
 * @date 2018-06-14 15:27:22
 */
@RestController
@RequestMapping("industrial/industrialhouselease")
public class IndustrialHouseLeaseController {
    @Autowired
    private IndustrialHouseLeaseService industrialHouseLeaseService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("industrial:industrialhouselease:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = industrialHouseLeaseService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{houseId}")
    @RequiresPermissions("industrial:industrialhouselease:info")
    public R info(@PathVariable("houseId") Long houseId){
        IndustrialHouseLeaseEntity industrialHouseLease = industrialHouseLeaseService.selectById(houseId);

        return R.ok().put("industrialHouseLease", industrialHouseLease);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("industrial:industrialhouselease:save")
    public R save(@RequestBody IndustrialHouseLeaseEntity industrialHouseLease){
        industrialHouseLeaseService.insert(industrialHouseLease);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("industrial:industrialhouselease:update")
    public R update(@RequestBody IndustrialHouseLeaseEntity industrialHouseLease){
        ValidatorUtils.validateEntity(industrialHouseLease);
        industrialHouseLeaseService.updateAllColumnById(industrialHouseLease);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("industrial:industrialhouselease:delete")
    public R delete(@RequestBody Long[] houseIds){
        industrialHouseLeaseService.deleteBatchIds(Arrays.asList(houseIds));

        return R.ok();
    }

}
