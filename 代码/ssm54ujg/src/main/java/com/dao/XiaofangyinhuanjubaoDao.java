package com.dao;

import com.entity.XiaofangyinhuanjubaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaofangyinhuanjubaoVO;
import com.entity.view.XiaofangyinhuanjubaoView;


/**
 * 消防隐患举报
 * 
 * @author 
 * @email 
 * @date 2021-03-10 22:14:18
 */
public interface XiaofangyinhuanjubaoDao extends BaseMapper<XiaofangyinhuanjubaoEntity> {
	
	List<XiaofangyinhuanjubaoVO> selectListVO(@Param("ew") Wrapper<XiaofangyinhuanjubaoEntity> wrapper);
	
	XiaofangyinhuanjubaoVO selectVO(@Param("ew") Wrapper<XiaofangyinhuanjubaoEntity> wrapper);
	
	List<XiaofangyinhuanjubaoView> selectListView(@Param("ew") Wrapper<XiaofangyinhuanjubaoEntity> wrapper);

	List<XiaofangyinhuanjubaoView> selectListView(Pagination page,@Param("ew") Wrapper<XiaofangyinhuanjubaoEntity> wrapper);
	
	XiaofangyinhuanjubaoView selectView(@Param("ew") Wrapper<XiaofangyinhuanjubaoEntity> wrapper);
	
}
