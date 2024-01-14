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


import com.dao.TongjifenleiDao;
import com.entity.TongjifenleiEntity;
import com.service.TongjifenleiService;
import com.entity.vo.TongjifenleiVO;
import com.entity.view.TongjifenleiView;

@Service("tongjifenleiService")
public class TongjifenleiServiceImpl extends ServiceImpl<TongjifenleiDao, TongjifenleiEntity> implements TongjifenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TongjifenleiEntity> page = this.selectPage(
                new Query<TongjifenleiEntity>(params).getPage(),
                new EntityWrapper<TongjifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TongjifenleiEntity> wrapper) {
		  Page<TongjifenleiView> page =new Query<TongjifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TongjifenleiVO> selectListVO(Wrapper<TongjifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TongjifenleiVO selectVO(Wrapper<TongjifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TongjifenleiView> selectListView(Wrapper<TongjifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TongjifenleiView selectView(Wrapper<TongjifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
