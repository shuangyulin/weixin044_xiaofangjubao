package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XiaofangyinhuanfenleiDao;
import com.entity.XiaofangyinhuanfenleiEntity;
import com.service.XiaofangyinhuanfenleiService;
import com.entity.vo.XiaofangyinhuanfenleiVO;
import com.entity.view.XiaofangyinhuanfenleiView;

@Service("xiaofangyinhuanfenleiService")
public class XiaofangyinhuanfenleiServiceImpl extends ServiceImpl<XiaofangyinhuanfenleiDao, XiaofangyinhuanfenleiEntity> implements XiaofangyinhuanfenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaofangyinhuanfenleiEntity> page = this.selectPage(
                new Query<XiaofangyinhuanfenleiEntity>(params).getPage(),
                new EntityWrapper<XiaofangyinhuanfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaofangyinhuanfenleiEntity> wrapper) {
		  Page<XiaofangyinhuanfenleiView> page =new Query<XiaofangyinhuanfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaofangyinhuanfenleiVO> selectListVO(Wrapper<XiaofangyinhuanfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaofangyinhuanfenleiVO selectVO(Wrapper<XiaofangyinhuanfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaofangyinhuanfenleiView> selectListView(Wrapper<XiaofangyinhuanfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaofangyinhuanfenleiView selectView(Wrapper<XiaofangyinhuanfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
