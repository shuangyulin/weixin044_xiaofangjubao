package com.dao;

import com.entity.ChulijieguoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChulijieguoVO;
import com.entity.view.ChulijieguoView;


/**
 * 处理结果
 * 
 * @author 
 * @email 
 * @date 2021-03-10 22:14:18
 */
public interface ChulijieguoDao extends BaseMapper<ChulijieguoEntity> {
	
	List<ChulijieguoVO> selectListVO(@Param("ew") Wrapper<ChulijieguoEntity> wrapper);
	
	ChulijieguoVO selectVO(@Param("ew") Wrapper<ChulijieguoEntity> wrapper);
	
	List<ChulijieguoView> selectListView(@Param("ew") Wrapper<ChulijieguoEntity> wrapper);

	List<ChulijieguoView> selectListView(Pagination page,@Param("ew") Wrapper<ChulijieguoEntity> wrapper);
	
	ChulijieguoView selectView(@Param("ew") Wrapper<ChulijieguoEntity> wrapper);
	
}
