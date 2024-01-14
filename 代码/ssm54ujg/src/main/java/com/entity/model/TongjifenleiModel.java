package com.entity.model;

import com.entity.TongjifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 统计分类
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-10 22:14:18
 */
public class TongjifenleiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 事件地址
	 */
	
	private String shijiandizhi;
		
	/**
	 * 消防隐患分类
	 */
	
	private String xiaofangyinhuanfenlei;
				
	
	/**
	 * 设置：事件地址
	 */
	 
	public void setShijiandizhi(String shijiandizhi) {
		this.shijiandizhi = shijiandizhi;
	}
	
	/**
	 * 获取：事件地址
	 */
	public String getShijiandizhi() {
		return shijiandizhi;
	}
				
	
	/**
	 * 设置：消防隐患分类
	 */
	 
	public void setXiaofangyinhuanfenlei(String xiaofangyinhuanfenlei) {
		this.xiaofangyinhuanfenlei = xiaofangyinhuanfenlei;
	}
	
	/**
	 * 获取：消防隐患分类
	 */
	public String getXiaofangyinhuanfenlei() {
		return xiaofangyinhuanfenlei;
	}
			
}
