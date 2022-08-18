package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Warehouse;
import com.example.demo.service.WarehouseServiceImpl;


@RestController
@RequestMapping("/api")
public class WarehouseController {
	
	@Autowired
	WarehouseServiceImpl warehouseServiceImpl;
	
	@GetMapping("/warehouses")
	public List<Warehouse> listWarehouses(){
		return warehouseServiceImpl.listWarehouses();
	}
	
	@PostMapping("/warehouses")
	public Warehouse saveWarehouse(@RequestBody Warehouse warehouse) {
		
		return warehouseServiceImpl.saveWarehouse(warehouse);
	}
	
	@GetMapping("/warehouses/{id}")
	public Warehouse warehouseByID(@PathVariable(name="id") Long id) {
		
		Warehouse warehouse_byid= new Warehouse();
		
		warehouse_byid = warehouseServiceImpl.warehouseByID(id);
		
		System.out.println("Warehouse by ID: " + warehouse_byid);
		
		return warehouse_byid;
	}
	
	@PutMapping("/warehouses/{id}")
	public Warehouse updateWarehouse(@PathVariable(name="id")Long id,@RequestBody Warehouse warehouse) {
		
		Warehouse warehouse_selected= new Warehouse();
		Warehouse warehouse_updated= new Warehouse();
		
		warehouse_selected= warehouseServiceImpl.warehouseByID(id);
		
		warehouse_selected.setLocation(warehouse.getLocation());
		warehouse_selected.setCapacity(warehouse.getCapacity());
		
		warehouse_updated = warehouseServiceImpl.updateWarehouse(warehouse_selected);
		
		System.out.println("El warehouse updated es: "+ warehouse_updated);
		
		return warehouse_updated;
	}
	
	@DeleteMapping("/warehouses/{id}")
	public void deleteWarehouse(@PathVariable(name="id")Long id) {
		warehouseServiceImpl.deleteWarehouse(id);
	}
	
	
}