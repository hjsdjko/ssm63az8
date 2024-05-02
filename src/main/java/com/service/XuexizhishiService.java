package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexizhishiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexizhishiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexizhishiView;


/**
 * 学习知识
 *
 * @author 
 * @email 
 * @date 2021-04-28 09:36:49
 */
public interface XuexizhishiService extends IService<XuexizhishiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexizhishiVO> selectListVO(Wrapper<XuexizhishiEntity> wrapper);
   	
   	XuexizhishiVO selectVO(@Param("ew") Wrapper<XuexizhishiEntity> wrapper);
   	
   	List<XuexizhishiView> selectListView(Wrapper<XuexizhishiEntity> wrapper);
   	
   	XuexizhishiView selectView(@Param("ew") Wrapper<XuexizhishiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexizhishiEntity> wrapper);
   	
}

