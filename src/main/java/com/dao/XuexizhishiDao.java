package com.dao;

import com.entity.XuexizhishiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexizhishiVO;
import com.entity.view.XuexizhishiView;


/**
 * 学习知识
 * 
 * @author 
 * @email 
 * @date 2021-04-28 09:36:49
 */
public interface XuexizhishiDao extends BaseMapper<XuexizhishiEntity> {
	
	List<XuexizhishiVO> selectListVO(@Param("ew") Wrapper<XuexizhishiEntity> wrapper);
	
	XuexizhishiVO selectVO(@Param("ew") Wrapper<XuexizhishiEntity> wrapper);
	
	List<XuexizhishiView> selectListView(@Param("ew") Wrapper<XuexizhishiEntity> wrapper);

	List<XuexizhishiView> selectListView(Pagination page,@Param("ew") Wrapper<XuexizhishiEntity> wrapper);
	
	XuexizhishiView selectView(@Param("ew") Wrapper<XuexizhishiEntity> wrapper);
	
}
