package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaofangyinhuanjubaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaofangyinhuanjubaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaofangyinhuanjubaoView;


/**
 * 消防隐患举报
 *
 * @author 
 * @email 
 * @date 2021-03-10 22:14:18
 */
public interface XiaofangyinhuanjubaoService extends IService<XiaofangyinhuanjubaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaofangyinhuanjubaoVO> selectListVO(Wrapper<XiaofangyinhuanjubaoEntity> wrapper);
   	
   	XiaofangyinhuanjubaoVO selectVO(@Param("ew") Wrapper<XiaofangyinhuanjubaoEntity> wrapper);
   	
   	List<XiaofangyinhuanjubaoView> selectListView(Wrapper<XiaofangyinhuanjubaoEntity> wrapper);
   	
   	XiaofangyinhuanjubaoView selectView(@Param("ew") Wrapper<XiaofangyinhuanjubaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaofangyinhuanjubaoEntity> wrapper);
   	
}

