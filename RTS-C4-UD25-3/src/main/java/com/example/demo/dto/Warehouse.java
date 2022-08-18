package com.example.demo.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="warehouses")
public class Warehouse  {
 
	//Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "location")
	private String location;
	@Column(name = "capacity")
	private int capacity;
	
    @OneToMany
    @JoinColumn(name="id")
    private List<Box> box;
	
	//Constructors
	
	public Warehouse() {
	
	}


	/**
	 * @param id
	 * @param location
	 * @param capacity
	 * @param box
	 */
	public Warehouse(Long id, String location, int capacity, List<Box> box) {
		this.id = id;
		this.location = location;
		this.capacity = capacity;
		this.box = box;
	}

	

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}



	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}



	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}



	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}



	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}



	/**
	 * @return the box
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Box")
	public List<Box> getBox() {
		return box;
	}



	/**
	 * @param box the box to set
	 */
	public void setBox(List<Box> box) {
		this.box = box;
	}



	@Override
	public String toString() {
		return "Warehouse [id=" + id + ", location=" + location + ", capacity=" + capacity + "]";
	}
}
	
	
	