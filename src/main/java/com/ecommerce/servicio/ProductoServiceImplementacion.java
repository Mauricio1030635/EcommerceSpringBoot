package com.ecommerce.servicio;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecommerce.model.Producto;
import com.ecommerce.repositorio.ProductoRepository;


public class ProductoServiceImplementacion 
implements ProductoService
{

	@Autowired
	private  ProductoRepository repor;
	
	
	@Override
	public Producto save(Producto producto) {

		return repor.save(producto);
	}

	@Override
	public Optional<Producto> get(Integer id) {
		// TODO Auto-generated method stub
		return repor.findById(id);
	}

	@Override
	public void Update(Producto producto) {
			repor.save(producto);
		
	}

	@Override
	public void delte(Integer id) {
		repor.deleteById(id);
		
	}

}
