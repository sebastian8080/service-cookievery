package com.moviles.complexivo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.moviles.complexivo.model.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Integer> {
	

}
