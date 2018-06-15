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

import io.renren.modules.industrial.entity.IndustrialAccContractEntity;
import io.renren.modules.industrial.service.IndustrialAccContractService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 合同信息
 *
 * @author yangxuan
 * @email netfalcon@gmail.com
 * @date 2018-06-14 15:27:21
 */
@RestController
@RequestMapping("industrial/industrialacccontract")
public class IndustrialAccContractController {
    @Autowired
    private IndustrialAccContractService industrialAccContractService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("industrial:industrialacccontract:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = industrialAccContractService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{contractId}")
    @RequiresPermissions("industrial:industrialacccontract:info")
    public R info(@PathVariable("contractId") Long contractId){
        IndustrialAccContractEntity industrialAccContract = industrialAccContractService.selectById(contractId);

        return R.ok().put("industrialAccContract", industrialAccContract);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("industrial:industrialacccontract:save")
    public R save(@RequestBody IndustrialAccContractEntity industrialAccContract){
        industrialAccContractService.insert(industrialAccContract);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("industrial:industrialacccontract:update")
    public R update(@RequestBody IndustrialAccContractEntity industrialAccContract){
        ValidatorUtils.validateEntity(industrialAccContract);
        industrialAccContractService.updateAllColumnById(industrialAccContract);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("industrial:industrialacccontract:delete")
    public R delete(@RequestBody Long[] contractIds){
        industrialAccContractService.deleteBatchIds(Arrays.asList(contractIds));

        return R.ok();
    }

}
