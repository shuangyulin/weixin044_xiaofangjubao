package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 统计分类
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-10 22:14:18
 */
@TableName("tongjifenlei")
public class TongjifenleiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public TongjifenleiEntity() {
		
	}
	
	public TongjifenleiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 事件描述
	 */
					
	private String shijianmiaoshu;
	
	/**
	 * 事件地址
	 */
					
	private String shijiandizhi;
	
	/**
	 * 消防隐患分类
	 */
					
	private String xiaofangyinhuanfenlei;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
