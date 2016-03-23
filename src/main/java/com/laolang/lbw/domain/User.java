package com.laolang.lbw.domain;

/**
 * 用户
 * @author 小代码
 * @version 1.0
 * 
 */
public class User {

	/**
	 * The Constructor.
	 */
	public User() {
		super();
	}

	/**
	 * The Constructor.
	 *
	 * @param name
	 *            the name
	 * @param phone
	 *            the phone
	 * @param qid
	 *            the qid
	 */
	public User(String name, String phone, String qid) {
		super();
		this.name = name;
		this.phone = phone;
		this.qid = qid;
	}

	/**
	 * The Constructor.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param phone
	 *            the phone
	 * @param qid
	 *            the qid
	 */
	public User(int id, String name, String phone, String qid) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.qid = qid;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", phone=" + phone
				+ ", qid=" + qid + "]";
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
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the phone.
	 *
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * Sets the phone.
	 *
	 * @param phone
	 *            the phone
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * Gets the qid.
	 *
	 * @return the qid
	 */
	public String getQid() {
		return qid;
	}

	/**
	 * Sets the qid.
	 *
	 * @param qid
	 *            the qid
	 */
	public void setQid(String qid) {
		this.qid = qid;
	}

	/** 用户编号 */
	private int id;

	/** 用户名 */
	private String name;

	/** 用户电话 */
	private String phone;

	/** 用户QQ号码 */
	private String qid;
}
