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


import com.dao.XuexizhishiDao;
import com.entity.XuexizhishiEntity;
import com.service.XuexizhishiService;
import com.entity.vo.XuexizhishiVO;
import com.entity.view.XuexizhishiView;

@Service("xuexizhishiService")
public class XuexizhishiServiceImpl extends ServiceImpl<XuexizhishiDao, XuexizhishiEntity> implements XuexizhishiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexizhishiEntity> page = this.selectPage(
                new Query<XuexizhishiEntity>(params).getPage(),
                new EntityWrapper<XuexizhishiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexizhishiEntity> wrapper) {
		  Page<XuexizhishiView> page =new Query<XuexizhishiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuexizhishiVO> selectListVO(Wrapper<XuexizhishiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexizhishiVO selectVO(Wrapper<XuexizhishiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexizhishiView> selectListView(Wrapper<XuexizhishiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexizhishiView selectView(Wrapper<XuexizhishiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
