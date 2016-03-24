package com.laolang.lbw.dao;

import com.laolang.lbw.domain.Engineer;

// TODO: Auto-generated Javadoc
/**
 * The Interface EngineerDao.
 */
public interface EngineerDao {

	/**
	 * Find engineer by id.
	 *
	 * @param id the id
	 * @return the engineer
	 */
	public Engineer findEngineerById( int id);
}
