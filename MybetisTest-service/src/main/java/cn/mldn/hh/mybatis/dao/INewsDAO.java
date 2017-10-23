package cn.mldn.hh.mybatis.dao;

import java.util.List;
import java.util.Map;

import cn.mldn.hh.mybatis.vo.News;

public interface INewsDAO {
	public boolean doCreate(News vo) ;
	public List<News> findByIds(Object ids) ; 
	public List<News> findSplit(Map<String,Object> params) ;
}
