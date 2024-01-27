package com.restdemo.restapi.controller;

import com.restdemo.restapi.model.CloudVendor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")
public class CloudAPIService {
	CloudVendor cloudVendor;
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(String vendorId){

		return cloudVendor;
	}
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
		this.cloudVendor=cloudVendor;
		return "created successfully";
	}
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
		this.cloudVendor=cloudVendor;
		return "updated successfully";
	}
	@DeleteMapping("{vendorId}")
	public String updateCloudVendorDetails(String vendorId){
		this.cloudVendor=null;
		return "deleted successfully";
	}
}
