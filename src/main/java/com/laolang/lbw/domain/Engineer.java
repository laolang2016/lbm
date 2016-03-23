package com.laolang.lbw.domain;

import java.util.Date;

/**
 * 工程师
 * @author 小代码
 * @version 1.0
 */
public class Engineer {

	/**
	 * The Constructor.
	 */
	public Engineer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * The Constructor.
	 *
	 * @param name
	 *            the name
	 * @param pic
	 *            the pic
	 * @param qid
	 *            the qid
	 * @param phone
	 *            the phone
	 * @param joinTime
	 *            the join time
	 * @param address
	 *            the address
	 * @param addressDetail
	 *            the address detail
	 * @param workTime
	 *            the work time
	 * @param bufInfo
	 *            the buf info
	 * @param door
	 *            the door
	 * @param doorPrice
	 *            the door price
	 */
	public Engineer(String name, String pic, String qid, String phone,
			Date joinTime, String address, String addressDetail,
			String workTime, String bufInfo, boolean door, double doorPrice) {
		super();
		this.name = name;
		this.pic = pic;
		this.qid = qid;
		this.phone = phone;
		this.joinTime = joinTime;
		this.address = address;
		this.addressDetail = addressDetail;
		this.workTime = workTime;
		this.bufInfo = bufInfo;
		this.door = door;
		this.doorPrice = doorPrice;
	}

	/**
	 * The Constructor.
	 *
	 * @param id
	 *            the id
	 * @param name
	 *            the name
	 * @param pic
	 *            the pic
	 * @param qid
	 *            the qid
	 * @param phone
	 *            the phone
	 * @param joinTime
	 *            the join time
	 * @param address
	 *            the address
	 * @param addressDetail
	 *            the address detail
	 * @param workTime
	 *            the work time
	 * @param bufInfo
	 *            the buf info
	 * @param door
	 *            the door
	 * @param doorPrice
	 *            the door price
	 */
	public Engineer(int id, String name, String pic, String qid, String phone,
			Date joinTime, String address, String addressDetail,
			String workTime, String bufInfo, boolean door, double doorPrice) {
		super();
		this.id = id;
		this.name = name;
		this.pic = pic;
		this.qid = qid;
		this.phone = phone;
		this.joinTime = joinTime;
		this.address = address;
		this.addressDetail = addressDetail;
		this.workTime = workTime;
		this.bufInfo = bufInfo;
		this.door = door;
		this.doorPrice = doorPrice;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Engineer [id=" + id + ", name=" + name + ", pic=" + pic
				+ ", qid=" + qid + ", phone=" + phone + ", joinTime="
				+ joinTime + ", address=" + address + ", addressDetail="
				+ addressDetail + ", workTime=" + workTime + ", bufInfo="
				+ bufInfo + ", door=" + door + ", doorPrice=" + doorPrice + "]";
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
	 * Gets the pic.
	 *
	 * @return the pic
	 */
	public String getPic() {
		return pic;
	}

	/**
	 * Sets the pic.
	 *
	 * @param pic
	 *            the pic
	 */
	public void setPic(String pic) {
		this.pic = pic;
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
	 * Gets the join time.
	 *
	 * @return the join time
	 */
	public Date getJoinTime() {
		return joinTime;
	}

	/**
	 * Sets the join time.
	 *
	 * @param joinTime
	 *            the join time
	 */
	public void setJoinTime(Date joinTime) {
		this.joinTime = joinTime;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address
	 *            the address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the address detail.
	 *
	 * @return the address detail
	 */
	public String getAddressDetail() {
		return addressDetail;
	}

	/**
	 * Sets the address detail.
	 *
	 * @param addressDetail
	 *            the address detail
	 */
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}

	/**
	 * Gets the work time.
	 *
	 * @return the work time
	 */
	public String getWorkTime() {
		return workTime;
	}

	/**
	 * Sets the work time.
	 *
	 * @param workTime
	 *            the work time
	 */
	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}

	/**
	 * Gets the buf info.
	 *
	 * @return the buf info
	 */
	public String getBufInfo() {
		return bufInfo;
	}

	/**
	 * Sets the buf info.
	 *
	 * @param bufInfo
	 *            the buf info
	 */
	public void setBufInfo(String bufInfo) {
		this.bufInfo = bufInfo;
	}

	/**
	 * Checks if is door.
	 *
	 * @return true, if checks if is door
	 */
	public boolean isDoor() {
		return door;
	}

	/**
	 * Sets the door.
	 *
	 * @param door
	 *            the door
	 */
	public void setDoor(boolean door) {
		this.door = door;
	}

	/**
	 * Gets the door price.
	 *
	 * @return the door price
	 */
	public double getDoorPrice() {
		return doorPrice;
	}

	/**
	 * Sets the door price.
	 *
	 * @param doorPrice
	 *            the door price
	 */
	public void setDoorPrice(double doorPrice) {
		this.doorPrice = doorPrice;
	}

	/** 工程师 */
	private int id;

	/** 工程师 */
	private String name;

	/** 工程师 */
	private String pic;

	/** 工程师编号 */
	private String qid;

	/** 电话 */
	private String phone;

	/** 加入时间 */
	private Date joinTime;

	/** 工程师地址 */
	private String address;

	/** 工程师详细住址 */
	private String addressDetail;

	/** 工程师工作时间段 */
	private String workTime;

	/** 购买需知 */
	private String bufInfo;

	/** 是否可上门 */
	private boolean door;

	/** 上门费用 */
	private double doorPrice;

}
