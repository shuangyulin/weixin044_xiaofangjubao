package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChulijieguoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChulijieguoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChulijieguoView;


/**
 * 处理结果
 *
 * @author 
 * @email 
 * @date 2021-03-10 22:14:18
 */
public interface ChulijieguoService extends IService<ChulijieguoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChulijieguoVO> selectListVO(Wrapper<ChulijieguoEntity> wrapper);
   	
   	ChulijieguoVO selectVO(@Param("ew") Wrapper<ChulijieguoEntity> wrapper);
   	
   	List<ChulijieguoView> selectListView(Wrapper<ChulijieguoEntity> wrapper);
   	
   	ChulijieguoView selectView(@Param("ew") Wrapper<ChulijieguoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChulijieguoEntity> wrapper);
   	
}

