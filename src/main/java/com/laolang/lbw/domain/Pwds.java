package com.laolang.lbw.domain;

/**
 * 密码
 * @author 小代码
 * @version 1.0
 */
public class Pwds {

	/**
	 * The Constructor.
	 */
	public Pwds() {
		super();
	}

	/**
	 * The Constructor.
	 *
	 * @param type
	 *            the type
	 * @param uid
	 *            the uid
	 * @param password
	 *            the password
	 */
	public Pwds(int type, int uid, String password) {
		super();
		this.type = type;
		this.uid = uid;
		this.password = password;
	}

	/**
	 * The Constructor.
	 *
	 * @param id
	 *            the id
	 * @param type
	 *            the type
	 * @param uid
	 *            the uid
	 * @param password
	 *            the password
	 */
	public Pwds(int id, int type, int uid, String password) {
		super();
		this.id = id;
		this.type = type;
		this.uid = uid;
		this.password = password;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pwds [id=" + id + ", type=" + type + ", uid=" + uid
				+ ", password=" + password + "]";
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * Sets the type.
	 *
	 * @param type
	 *            the type
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * Gets the uid.
	 *
	 * @return the uid
	 */
	public int getUid() {
		return uid;
	}

	/**
	 * Sets the uid.
	 *
	 * @param uid
	 *            the uid
	 */
	public void setUid(int uid) {
		this.uid = uid;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password
	 *            the password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/** 密码ID */
	private int id;

	/** 用户类型，1表示工程师，0表示用户 */
	private int type;

	/** 用户ID */
	private int uid;

	/** 密码 */
	private String password;
}
