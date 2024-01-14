package com.entity.view;

import com.entity.XiaofangyinhuanjubaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 消防隐患举报
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-10 22:14:18
 */
@TableName("xiaofangyinhuanjubao")
public class XiaofangyinhuanjubaoView  extends XiaofangyinhuanjubaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaofangyinhuanjubaoView(){
	}
 
 	public XiaofangyinhuanjubaoView(XiaofangyinhuanjubaoEntity xiaofangyinhuanjubaoEntity){
 	try {
			BeanUtils.copyProperties(this, xiaofangyinhuanjubaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
