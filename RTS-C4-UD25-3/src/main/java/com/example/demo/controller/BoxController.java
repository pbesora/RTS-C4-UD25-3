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

import com.example.demo.dto.Box;
import com.example.demo.service.BoxServiceImpl;



@RestController
@RequestMapping("/api")
public class BoxController {

	@Autowired
	BoxServiceImpl boxServideImpl;
	
	@GetMapping("/boxes")
	public List<Box> listBoxs(){
		return boxServideImpl.listBoxes();
	}
	
	@PostMapping("/boxes")
	public Box saveBoxs(@RequestBody Box box) {
		
		return boxServideImpl.saveBox(box);
	}
	
	@GetMapping("/boxes/{id}")
	public Box boxByID(@PathVariable(name="id") Long id) {
		
		Box box_xid= new Box();
		
		box_xid=boxServideImpl.boxByID(id);
		
		System.out.println("Box XID: "+box_xid);
		
		return box_xid;
	}
	
	@PutMapping("/boxes/{id}")
	public Box updateBox(@PathVariable(name="id")Long id,@RequestBody Box box) {
		
		Box box_selected = new Box();
		Box box_updated = new Box();
		
		box_selected= boxServideImpl.boxByID(id);
		
		box_selected.setContent(box.getContent());
		box_selected.setValue(box.getValue());
		box_selected.setWarehouse(box.getWarehouse());
		
		box_updated = boxServideImpl.updateBox(box_selected);
		
		System.out.println("El box actualizado es: " + box_updated);
		
		return box_updated;
	}
	
	@DeleteMapping("/boxes/{id}")
	public void deleteBox(@PathVariable(name="id")Long id) {
		boxServideImpl.deleteBox(id);
	}
	
}