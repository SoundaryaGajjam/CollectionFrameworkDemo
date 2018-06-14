package com.scp.collection.sorting;

public class Mobis {
	private int mobId;
	private String mobName;
	private long price;
	public int getMobId() {
		return mobId;
	}
	public void setMobId(int mobId) {
		this.mobId = mobId;
	}
	public String getMobName() {
		return mobName;
	}
	public void setMobName(String mobName) {
		this.mobName = mobName;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Mobis(int mobId, String mobName, long price) {
		super();
		this.mobId = mobId;
		this.mobName = mobName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "\nMobile [mobId=" + mobId + ", mobName=" + mobName + ", price=" + price + "]";
	}

}
