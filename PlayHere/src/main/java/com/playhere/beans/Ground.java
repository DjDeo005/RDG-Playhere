package com.playhere.beans;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Ground {

	@Id
	@GeneratedValue
	private Long gid;
	private String location;
	private String groundType;
	private String image;
	private String Sports;
	
	@ManyToOne(targetEntity=Users.class,cascade=CascadeType.ALL)
	@JoinColumn(name="uid",referencedColumnName = "id")
	@JsonIgnoreProperties(value={"firstname","lastname", "email", "mobile", "role","pass"})
	private Users owner;
	public Ground() {
		super();
	}
	public Ground(Long gid, String location, String groundType, String image, String sports) {
		super();
		this.gid = gid;
		this.location = location;
		this.groundType = groundType;
		this.image = image;
		Sports = sports;
	}
	
	public Long getGid() {
		return gid;
	}
	public void setGid(Long gid) {
		this.gid = gid;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getGroundType() {
		return groundType;
	}
	public void setGroundType(String groundType) {
		this.groundType = groundType;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getSports() {
		return Sports;
	}
	public void setSports(String sports) {
		Sports = sports;
	}
	public Users getOwner() {
		return owner;
	}
	public void setOwner(Users owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Ground [gid=" + gid + ", location=" + location + ", groundType=" + groundType + ", image=" + image
				+ ", Sports=" + Sports + "]";
	}

	
}
