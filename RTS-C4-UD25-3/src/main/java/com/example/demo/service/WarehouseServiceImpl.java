package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IWarehouseDAO;
import com.example.demo.dto.Warehouse;

@Service
public class WarehouseServiceImpl implements IWarehouseService{

	@Autowired
	IWarehouseDAO iWarehouseDAO;


	@Override
	public List<Warehouse> listWarehouses() {
		return iWarehouseDAO.findAll();
	}

	@Override
	public Warehouse saveWarehouse(Warehouse warehouse) {
		return iWarehouseDAO.save(warehouse);
	}

	@Override
	public Warehouse warehouseByID(Long id) {
		return iWarehouseDAO.findById(id).get();
	}

	@Override
	public Warehouse updateWarehouse(Warehouse warehouse) {
		return iWarehouseDAO.save(warehouse);
	}

	@Override
	public void deleteWarehouse(Long id) {
		iWarehouseDAO.deleteById(id);
		
	}

}
