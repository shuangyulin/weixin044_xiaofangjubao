package com.entity.model;

import com.entity.ChulijieguoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 处理结果
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-10 22:14:18
 */
public class ChulijieguoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 联系方式
	 */
	
	private String lianxifangshi;
		
	/**
	 * 事件时间
	 */
	
	private String shijianshijian;
		
	/**
	 * 事件描述
	 */
	
	private String shijianmiaoshu;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 事件地址
	 */
	
	private String shijiandizhi;
		
	/**
	 * 处理状态
	 */
	
	private String chulizhuangtai;
		
	/**
	 * 处理详情
	 */
	
	private String chulixiangqing;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：联系方式
	 */
	 
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
				
	
	/**
	 * 设置：事件时间
	 */
	 
	public void setShijianshijian(String shijianshijian) {
		this.shijianshijian = shijianshijian;
	}
	
	/**
	 * 获取：事件时间
	 */
	public String getShijianshijian() {
		return shijianshijian;
	}
				
	
	/**
	 * 设置：事件描述
	 */
	 
	public void setShijianmiaoshu(String shijianmiaoshu) {
		this.shijianmiaoshu = shijianmiaoshu;
	}
	
	/**
	 * 获取：事件描述
	 */
	public String getShijianmiaoshu() {
		return shijianmiaoshu;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
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
	 * 设置：处理状态
	 */
	 
	public void setChulizhuangtai(String chulizhuangtai) {
		this.chulizhuangtai = chulizhuangtai;
	}
	
	/**
	 * 获取：处理状态
	 */
	public String getChulizhuangtai() {
		return chulizhuangtai;
	}
				
	
	/**
	 * 设置：处理详情
	 */
	 
	public void setChulixiangqing(String chulixiangqing) {
		this.chulixiangqing = chulixiangqing;
	}
	
	/**
	 * 获取：处理详情
	 */
	public String getChulixiangqing() {
		return chulixiangqing;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
