package org.ellen.kusuma.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder.Case;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

@Entity
@Table (name="USER_DETAILS")
public class UserDetails {
	@Id @GeneratedValue(strategy=GenerationType.AUTO)

	private int userId;
	private String userName;
//	@OneToMany(cascade=CascadeType.PERSIST)
//	private Collection<Vehicle> vehicle= new ArrayList<Vehicle>();
	
//	@ElementCollection(fetch=FetchType.EAGER)
//	@JoinTable(name="USER_ADDRESS",
//				joinColumns=@JoinColumn(name="USER_ID")
//	)
////	@GenericGenerator(name = "hilo-gen", strategy = "hilo")
////	@CollectionId(columns={@Column(name="ADDRESS_ID")},generator="hilo-gen",type=@Type(type="long"))
//	private Collection<Address> listAddress = new ArrayList();
//	
//	
//	public Collection<Address> getListAddress() {
//		return listAddress;
//	}
//	public void setListAddress(Collection<Address> listAddress) {
//		this.listAddress = listAddress;
//	}
	

	/**@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street",column=@Column(name="HOME_STREET_NAME")),
		@AttributeOverride(name="city",column=@Column(name="HOME_CITY_NAME")),
		@AttributeOverride(name="state",column=@Column(name="HOME_STATE_NAME")),
		@AttributeOverride(name="pincode",column=@Column(name="HOME_PIN_CODE"))})
	
	private Address homeAddress;
	private Address offAddr;*/
	
//	@Temporal(TemporalType.DATE) 
//	private Date joinedDate;
//	private String Address;
//	private String description;
	

	//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
//	public Date getJoinedDate() {
//		return joinedDate;
//	}
//	public void setJoinedDate(Date joinedDate) {
//		this.joinedDate = joinedDate;
//	}
//	public String getAddress() {
//		return Address;
//	}
//	public void setAddress(String address) {
//		Address = address;
//	}
	public int getUserId() {
		return userId;
	}
//public Collection<Vehicle> getVehicle() {
//		return vehicle;
//	}
//	public void setVehicle(Collection<Vehicle> vehicle) {
//		this.vehicle = vehicle;
//	}
	//	public Address getHomeAddress() {
//		return homeAddress;
//	}
//	public void setHomeAddress(Address homeAddress) {
//		this.homeAddress = homeAddress;
//	}
//	public Address getOffAddr() {
//		return offAddr;
//	}
//	public void setOffAddr(Address offAddr) {
//		this.offAddr = offAddr;
//	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}



}
