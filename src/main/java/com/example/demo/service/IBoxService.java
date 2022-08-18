package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.Box;


public interface IBoxService {
	//Metodos del CRUD
			public List<Box> listBoxes(); //Listar All 
			
			public Box saveBox(Box box);	//Guarda un video CREATE
			
			public Box boxByID(Long id); //Leer datos de un video READ
			
			public Box updateBox(Box box); //Actualiza datos del video UPDATE
			
			public void deleteBox(Long id);// Elimina el video DELETE

			
}
