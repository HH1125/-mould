package cn.mldn.hh.mybatis.service.impl;

import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mldn.hh.mybatis.dao.INewsDAO;
import cn.mldn.hh.mybatis.service.INewsService;
import cn.mldn.hh.mybatis.vo.News;
import cn.mldn.hh.util.service.abs.AbstractService;

@Service
public class NewsServiceImpl extends AbstractService implements INewsService {

	@Resource
	private INewsDAO newsDAO;

	@Override
	public List<News> listSplit(long currentPage, int lineSize, String column, String keyWord) {
		return this.newsDAO.findSplit(super.paramToMap(currentPage, lineSize, column, keyWord));
	} 

	@Override
	public boolean add(News vo) {
		return this.newsDAO.doCreate(vo);
	}

	@Override
	public List<News> listByIds(Set<Long> ids) {
		if (ids == null || ids.size() == 0) {
			return null;
		}
		return this.newsDAO.findByIds(ids.toArray());
	}

}
