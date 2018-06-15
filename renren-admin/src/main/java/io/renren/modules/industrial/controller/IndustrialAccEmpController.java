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

import io.renren.modules.industrial.entity.IndustrialAccEmpEntity;
import io.renren.modules.industrial.service.IndustrialAccEmpService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 员工信息
 *
 * @author yangxuan
 * @email netfalcon@gmail.com
 * @date 2018-06-14 15:27:21
 */
@RestController
@RequestMapping("industrial/industrialaccemp")
public class IndustrialAccEmpController {
    @Autowired
    private IndustrialAccEmpService industrialAccEmpService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("industrial:industrialaccemp:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = industrialAccEmpService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{empId}")
    @RequiresPermissions("industrial:industrialaccemp:info")
    public R info(@PathVariable("empId") Long empId){
        IndustrialAccEmpEntity industrialAccEmp = industrialAccEmpService.selectById(empId);

        return R.ok().put("industrialAccEmp", industrialAccEmp);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("industrial:industrialaccemp:save")
    public R save(@RequestBody IndustrialAccEmpEntity industrialAccEmp){
        industrialAccEmpService.insert(industrialAccEmp);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("industrial:industrialaccemp:update")
    public R update(@RequestBody IndustrialAccEmpEntity industrialAccEmp){
        ValidatorUtils.validateEntity(industrialAccEmp);
        industrialAccEmpService.updateAllColumnById(industrialAccEmp);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("industrial:industrialaccemp:delete")
    public R delete(@RequestBody Long[] empIds){
        industrialAccEmpService.deleteBatchIds(Arrays.asList(empIds));

        return R.ok();
    }

}
