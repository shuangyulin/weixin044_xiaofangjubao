package com.dao;

import com.entity.TongjifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TongjifenleiVO;
import com.entity.view.TongjifenleiView;


/**
 * 统计分类
 * 
 * @author 
 * @email 
 * @date 2021-03-10 22:14:18
 */
public interface TongjifenleiDao extends BaseMapper<TongjifenleiEntity> {
	
	List<TongjifenleiVO> selectListVO(@Param("ew") Wrapper<TongjifenleiEntity> wrapper);
	
	TongjifenleiVO selectVO(@Param("ew") Wrapper<TongjifenleiEntity> wrapper);
	
	List<TongjifenleiView> selectListView(@Param("ew") Wrapper<TongjifenleiEntity> wrapper);

	List<TongjifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<TongjifenleiEntity> wrapper);
	
	TongjifenleiView selectView(@Param("ew") Wrapper<TongjifenleiEntity> wrapper);
	
}
