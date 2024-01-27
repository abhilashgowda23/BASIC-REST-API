package com.restdemo.restapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor

public class CloudVendor {

	private String vendorId;
	private String vendorName;
	private String vendorAdress;
	private String phoneNum;

	@Override
	public String toString() {
		return "CloudVendor{" +
				"vendorId='" + vendorId + '\'' +
				", vendorName='" + vendorName + '\'' +
				", vendorAdress='" + vendorAdress + '\'' +
				", phoneNum='" + phoneNum + '\'' +
				'}';
	}
}
