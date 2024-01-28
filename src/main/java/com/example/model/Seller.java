package com.example.model;



import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.BatchSize;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Seller {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long propertyid;//
	@NotNull
	private String propertName;//
	@NotNull
	private String propertyType;
	private String propertyadtype;//
	@NotNull
	private String address;//
	private String amenities;//
	private String city;//
	@NotNull
	private String aprtmentType;//
	private String bhkType;//
	private int floor;//
	@NotNull
	private String contactNumber;//
	private String description;//
	private Long expectedRent;//
	private Long expectedDeposit;//
	private Long maintenance;//
	@JsonFormat(pattern = "yyyy-MM-dd")
	private String possesionDate;//
	
	private String status;//
	private boolean rented;
	   private boolean sale;
	   private long salePrice;

		

	@OneToMany(cascade=CascadeType.ALL)
	//@JoinColumn(name="imageid")
	private Set<ImageModel> images;//


	private String builtupArea;//

    private byte[] picbytes;
    private String imgname;
	public Long getPropertyid() {
		return propertyid;
	}
	public void setPropertyid(Long propertyid) {
		this.propertyid = propertyid;
	}
	public String getPropertName() {
		return propertName;
	}
	public void setPropertName(String propertName) {
		this.propertName = propertName;
	}
	public String getPropertyType() {
		return propertyType;
	}
	public void setPropertyType(String propertyType) {
		this.propertyType = propertyType;
	}
	public String getPropertyadtype() {
		return propertyadtype;
	}
	public void setPropertyadtype(String propertyadtype) {
		this.propertyadtype = propertyadtype;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAmenities() {
		return amenities;
	}
	public void setAmenities(String amenities) {
		this.amenities = amenities;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAprtmentType() {
		return aprtmentType;
	}
	public void setAprtmentType(String aprtmentType) {
		this.aprtmentType = aprtmentType;
	}
	public String getBhkType() {
		return bhkType;
	}
	public void setBhkType(String bhkType) {
		this.bhkType = bhkType;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getExpectedRent() {
		return expectedRent;
	}
	public void setExpectedRent(Long expectedRent) {
		this.expectedRent = expectedRent;
	}
	public Long getExpectedDeposit() {
		return expectedDeposit;
	}
	public void setExpectedDeposit(Long expectedDeposit) {
		this.expectedDeposit = expectedDeposit;
	}
	public Long getMaintenance() {
		return maintenance;
	}
	public void setMaintenance(Long maintenance) {
		this.maintenance = maintenance;
	}
	public String getPossesionDate() {
		return possesionDate;
	}
	public void setPossesionDate(String possesionDate) {
		this.possesionDate = possesionDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Set<ImageModel> getImages() {
		return images;
	}
	public void setImages(Set<ImageModel> images) {
		this.images = images;
	}
	public String getBuiltupArea() {
		return builtupArea;
	}
	public void setBuiltupArea(String builtupArea) {
		this.builtupArea = builtupArea;
	}
	public byte[] getPicbytes() {
		return picbytes;
	}
	public void setPicbytes(byte[] picbytes) {
		this.picbytes = picbytes;
	}
	public String getImgname() {
		return imgname;
	}
	public void setImgname(String imgname) {
		this.imgname = imgname;
	}
	public Seller(Long propertyid, String propertName, String propertyType, String propertyadtype, String address,
			String amenities, String city, String aprtmentType, String bhkType, int floor, String contactNumber,
			String description, Long expectedRent, Long expectedDeposit, Long maintenance, String possesionDate,
			String status, Set<ImageModel> images, String builtupArea, byte[] picbytes, String imgname) {
		super();
		this.propertyid = propertyid;
		this.propertName = propertName;
		this.propertyType = propertyType;
		this.propertyadtype = propertyadtype;
		this.address = address;
		this.amenities = amenities;
		this.city = city;
		this.aprtmentType = aprtmentType;
		this.bhkType = bhkType;
		this.floor = floor;
		this.contactNumber = contactNumber;
		this.description = description;
		this.expectedRent = expectedRent;
		this.expectedDeposit = expectedDeposit;
		this.maintenance = maintenance;
		this.possesionDate = possesionDate;
		this.status = status;
		this.images = images;
		this.builtupArea = builtupArea;
		this.picbytes = picbytes;
		this.imgname = imgname;
	}
	
   

	
}

