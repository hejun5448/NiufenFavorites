package io.renren.dict.dao;

import io.renren.dict.entity.DictWordEtymaRelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 字典-单词词源关联表
 * 
 * @author niufen
 * @email haijun917@qq.com
 * @date 2019-12-18 22:21:34
 */
@Mapper
public interface DictWordEtymaRelDao extends BaseMapper<DictWordEtymaRelEntity> {
	
}
