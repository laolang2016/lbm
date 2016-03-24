package com.laolang.lbw.services;

import org.apache.ibatis.session.SqlSession;

import com.laolang.lbw.dao.EngineerDao;
import com.laolang.lbw.domain.Engineer;
import com.laolang.lbw.util.MybatisUtil;

public class EngineerService {
	public Engineer findEngineerById(int id) {
		SqlSession session = MybatisUtil.openSession();
		Engineer engineer = null;
		try {
			EngineerDao engineerDao = session.getMapper(EngineerDao.class);
			engineer = engineerDao.findEngineerById(id);
		} finally {
			session.close();
		}
		return engineer;
	}
}
