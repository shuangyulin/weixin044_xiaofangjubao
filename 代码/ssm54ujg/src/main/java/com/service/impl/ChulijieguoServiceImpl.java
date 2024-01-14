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


import com.dao.ChulijieguoDao;
import com.entity.ChulijieguoEntity;
import com.service.ChulijieguoService;
import com.entity.vo.ChulijieguoVO;
import com.entity.view.ChulijieguoView;

@Service("chulijieguoService")
public class ChulijieguoServiceImpl extends ServiceImpl<ChulijieguoDao, ChulijieguoEntity> implements ChulijieguoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChulijieguoEntity> page = this.selectPage(
                new Query<ChulijieguoEntity>(params).getPage(),
                new EntityWrapper<ChulijieguoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChulijieguoEntity> wrapper) {
		  Page<ChulijieguoView> page =new Query<ChulijieguoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChulijieguoVO> selectListVO(Wrapper<ChulijieguoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChulijieguoVO selectVO(Wrapper<ChulijieguoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChulijieguoView> selectListView(Wrapper<ChulijieguoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChulijieguoView selectView(Wrapper<ChulijieguoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
