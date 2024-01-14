package com.dao;

import com.entity.XiaofangyinhuanfenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaofangyinhuanfenleiVO;
import com.entity.view.XiaofangyinhuanfenleiView;


/**
 * 消防隐患分类
 * 
 * @author 
 * @email 
 * @date 2021-03-10 22:14:18
 */
public interface XiaofangyinhuanfenleiDao extends BaseMapper<XiaofangyinhuanfenleiEntity> {
	
	List<XiaofangyinhuanfenleiVO> selectListVO(@Param("ew") Wrapper<XiaofangyinhuanfenleiEntity> wrapper);
	
	XiaofangyinhuanfenleiVO selectVO(@Param("ew") Wrapper<XiaofangyinhuanfenleiEntity> wrapper);
	
	List<XiaofangyinhuanfenleiView> selectListView(@Param("ew") Wrapper<XiaofangyinhuanfenleiEntity> wrapper);

	List<XiaofangyinhuanfenleiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaofangyinhuanfenleiEntity> wrapper);
	
	XiaofangyinhuanfenleiView selectView(@Param("ew") Wrapper<XiaofangyinhuanfenleiEntity> wrapper);
	
}
