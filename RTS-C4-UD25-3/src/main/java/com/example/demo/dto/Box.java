package com.example.demo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="boxes")//en caso que la tabla sea diferente

public class Box {
	
	//Atributos de entidad cliente
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		@Column(name = "content")//no hace falta si se llama igual
		private String content;
		@Column(name = "value")//no hace falta si se llama igual
		private int value;
		
		@ManyToOne
	    @JoinColumn(name="warehouse")
	    private Warehouse warehouse;

		//Constructores
		/**
		 * 
		 */
		public Box() {
			
		}

		/**
		 * @param id
		 * @param content
		 * @param value
		 * @param warehouse
		 */
		public Box(Long id, String content, int value, Warehouse warehouse) {
			this.id = id;
			this.content = content;
			this.value = value;
			this.warehouse = warehouse;
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
		 * @return the content
		 */
		public String getContent() {
			return content;
		}

		/**
		 * @param content the content to set
		 */
		public void setContent(String content) {
			this.content = content;
		}

		/**
		 * @return the value
		 */
		public int getValue() {
			return value;
		}

		/**
		 * @param value the value to set
		 */
		public void setValue(int value) {
			this.value = value;
		}

		/**
		 * @return the warehouse
		 */
		public Warehouse getWarehouse() {
			return warehouse;
		}

		/**
		 * @param warehouse the warehouse to set
		 */
		public void setWarehouse(Warehouse warehouse) {
			this.warehouse = warehouse;
		}

		@Override
		public String toString() {
			return "Box [id=" + id + ", content=" + content + ", value=" + value + ", warehouse=" + warehouse + "]";
		}

		
		
}