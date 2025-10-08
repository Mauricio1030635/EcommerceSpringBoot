package com.ecommerce.servicio;

import java.util.Optional;

import com.ecommerce.model.Producto;

public interface ProductoService {
	public Producto save(Producto producto);
	public Optional<Producto>get(Integer id);
	public void Update(Producto  producto);
	public void delte (Integer id);
	
}
