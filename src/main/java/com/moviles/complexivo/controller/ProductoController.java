package com.moviles.complexivo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviles.complexivo.model.Producto;
import com.moviles.complexivo.repository.ProductoRepository;

@RestController
@RequestMapping("/productos")
public class ProductoController {

	@Autowired
	ProductoRepository productoRepository;
	
	
	@GetMapping("/all")
	public List<Producto> getAll(){
		return productoRepository.findAll();
	}
	
	@GetMapping("/prueba")
	public String prueba(){
		return "Hola";
	}
	
}
