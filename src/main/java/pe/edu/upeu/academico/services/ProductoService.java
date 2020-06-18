package pe.edu.upeu.academico.services;

import java.util.List;

import pe.edu.upeu.academico.entity.Categoria;
import pe.edu.upeu.academico.entity.Producto;

public interface ProductoService {
	public List<Producto> findAll();
	public Producto findById(Long id);
	public Producto save(Producto producto);
	public void delete(Long id);
	public void Update(Producto producto,long idproducto);
}
