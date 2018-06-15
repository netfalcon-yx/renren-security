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

import io.renren.modules.industrial.entity.IndustrialAccPostEntity;
import io.renren.modules.industrial.service.IndustrialAccPostService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 岗位信息
 *
 * @author yangxuan
 * @email netfalcon@gmail.com
 * @date 2018-06-14 15:27:21
 */
@RestController
@RequestMapping("industrial/industrialaccpost")
public class IndustrialAccPostController {
    @Autowired
    private IndustrialAccPostService industrialAccPostService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("industrial:industrialaccpost:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = industrialAccPostService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{postId}")
    @RequiresPermissions("industrial:industrialaccpost:info")
    public R info(@PathVariable("postId") Long postId){
        IndustrialAccPostEntity industrialAccPost = industrialAccPostService.selectById(postId);

        return R.ok().put("industrialAccPost", industrialAccPost);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("industrial:industrialaccpost:save")
    public R save(@RequestBody IndustrialAccPostEntity industrialAccPost){
        industrialAccPostService.insert(industrialAccPost);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("industrial:industrialaccpost:update")
    public R update(@RequestBody IndustrialAccPostEntity industrialAccPost){
        ValidatorUtils.validateEntity(industrialAccPost);
        industrialAccPostService.updateAllColumnById(industrialAccPost);//全部更新
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("industrial:industrialaccpost:delete")
    public R delete(@RequestBody Long[] postIds){
        industrialAccPostService.deleteBatchIds(Arrays.asList(postIds));

        return R.ok();
    }

}
