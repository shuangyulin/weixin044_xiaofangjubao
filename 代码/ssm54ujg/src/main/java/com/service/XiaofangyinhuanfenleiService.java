package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaofangyinhuanfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaofangyinhuanfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaofangyinhuanfenleiView;


/**
 * 消防隐患分类
 *
 * @author 
 * @email 
 * @date 2021-03-10 22:14:18
 */
public interface XiaofangyinhuanfenleiService extends IService<XiaofangyinhuanfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaofangyinhuanfenleiVO> selectListVO(Wrapper<XiaofangyinhuanfenleiEntity> wrapper);
   	
   	XiaofangyinhuanfenleiVO selectVO(@Param("ew") Wrapper<XiaofangyinhuanfenleiEntity> wrapper);
   	
   	List<XiaofangyinhuanfenleiView> selectListView(Wrapper<XiaofangyinhuanfenleiEntity> wrapper);
   	
   	XiaofangyinhuanfenleiView selectView(@Param("ew") Wrapper<XiaofangyinhuanfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaofangyinhuanfenleiEntity> wrapper);
   	
}

