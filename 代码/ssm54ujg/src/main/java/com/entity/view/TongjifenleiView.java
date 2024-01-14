package com.entity.view;

import com.entity.TongjifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 统计分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-10 22:14:18
 */
@TableName("tongjifenlei")
public class TongjifenleiView  extends TongjifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TongjifenleiView(){
	}
 
 	public TongjifenleiView(TongjifenleiEntity tongjifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, tongjifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
