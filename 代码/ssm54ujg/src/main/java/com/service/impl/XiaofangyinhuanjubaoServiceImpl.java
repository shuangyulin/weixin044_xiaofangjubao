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


import com.dao.XiaofangyinhuanjubaoDao;
import com.entity.XiaofangyinhuanjubaoEntity;
import com.service.XiaofangyinhuanjubaoService;
import com.entity.vo.XiaofangyinhuanjubaoVO;
import com.entity.view.XiaofangyinhuanjubaoView;

@Service("xiaofangyinhuanjubaoService")
public class XiaofangyinhuanjubaoServiceImpl extends ServiceImpl<XiaofangyinhuanjubaoDao, XiaofangyinhuanjubaoEntity> implements XiaofangyinhuanjubaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaofangyinhuanjubaoEntity> page = this.selectPage(
                new Query<XiaofangyinhuanjubaoEntity>(params).getPage(),
                new EntityWrapper<XiaofangyinhuanjubaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaofangyinhuanjubaoEntity> wrapper) {
		  Page<XiaofangyinhuanjubaoView> page =new Query<XiaofangyinhuanjubaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaofangyinhuanjubaoVO> selectListVO(Wrapper<XiaofangyinhuanjubaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaofangyinhuanjubaoVO selectVO(Wrapper<XiaofangyinhuanjubaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaofangyinhuanjubaoView> selectListView(Wrapper<XiaofangyinhuanjubaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaofangyinhuanjubaoView selectView(Wrapper<XiaofangyinhuanjubaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
