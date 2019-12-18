package io.renren.dict.controller;

import java.util.Arrays;
import java.util.Map;

import io.renren.common.validator.ValidatorUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.renren.dict.entity.DictChapterEntity;
import io.renren.dict.service.DictChapterService;
import io.renren.common.utils.PageUtils;
import io.renren.common.utils.R;



/**
 * 词典-书-章节
 *
 * @author niufen
 * @email haijun917@qq.com
 * @date 2019-12-18 22:21:34
 */
@RestController
@RequestMapping("dict/dictchapter")
public class DictChapterController {
    @Autowired
    private DictChapterService dictChapterService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = dictChapterService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DictChapterEntity dictChapter = dictChapterService.getById(id);

        return R.ok().put("dictChapter", dictChapter);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DictChapterEntity dictChapter){
        dictChapterService.save(dictChapter);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DictChapterEntity dictChapter){
        ValidatorUtils.validateEntity(dictChapter);
        dictChapterService.updateById(dictChapter);
        
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dictChapterService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
