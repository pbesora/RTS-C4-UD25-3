package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Warehouse;

public interface IWarehouseService {

	//Metodos del CRUD
		public List<Warehouse> listWarehouses(); //Listar All 
		
		public Warehouse saveWarehouse(Warehouse warehouse);	//Guarda un cliente CREATE
		
		public Warehouse warehouseByID(Long id); //Leer datos de un cliente READ
		
		public Warehouse updateWarehouse(Warehouse warehouse); //Actualiza datos del cliente UPDATE
		
		public void deleteWarehouse(Long id);// Elimina el cliente DELETE
}
