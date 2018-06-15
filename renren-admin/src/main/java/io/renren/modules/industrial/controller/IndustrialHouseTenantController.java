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

import io.renren.modules.industrial.entity.IndustrialHouseTenantEntity;
import io.renren.modules.industrial.service.IndustrialHouseTenantService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 租客信息
 *
 * @author yangxuan
 * @email netfalcon@gmail.com
 * @date 2018-06-14 15:27:22
 */
@RestController
@RequestMapping("industrial/industrialhousetenant")
public class IndustrialHouseTenantController {
    @Autowired
    private IndustrialHouseTenantService industrialHouseTenantService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("industrial:industrialhousetenant:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = industrialHouseTenantService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{tenantId}")
    @RequiresPermissions("industrial:industrialhousetenant:info")
    public R info(@PathVariable("tenantId") Long tenantId){
        IndustrialHouseTenantEntity industrialHouseTenant = industrialHouseTenantService.selectById(tenantId);

        return R.ok().put("industrialHouseTenant", industrialHouseTenant);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("industrial:industrialhousetenant:save")
    public R save(@RequestBody IndustrialHouseTenantEntity industrialHouseTenant){
        industrialHouseTenantService.insert(industrialHouseTenant);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("industrial:industrialhousetenant:update")
    public R update(@RequestBody IndustrialHouseTenantEntity industrialHouseTenant){
        ValidatorUtils.validateEntity(industrialHouseTenant);
        industrialHouseTenantService.updateAllColumnById(industrialHouseTenant);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("industrial:industrialhousetenant:delete")
    public R delete(@RequestBody Long[] tenantIds){
        industrialHouseTenantService.deleteBatchIds(Arrays.asList(tenantIds));

        return R.ok();
    }

}
