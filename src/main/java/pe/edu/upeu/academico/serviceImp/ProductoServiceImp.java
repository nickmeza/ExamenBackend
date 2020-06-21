package pe.edu.upeu.academico.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.edu.upeu.academico.dao.ProductoDao;
import pe.edu.upeu.academico.entity.Producto;
import pe.edu.upeu.academico.services.ProductoService;

@Service
public class ProductoServiceImp implements ProductoService{
	@Autowired
	private ProductoDao prodao;

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return (List<Producto>) prodao.findAll();
	}
	@Override
	@Transactional(readOnly = true)
	public Producto findById(Long id) {
		// TODO Auto-generated method stub
		return prodao.findById(id).orElse(null);
	}
	@Override
	@Transactional
	public Producto save(Producto producto) {
		// TODO Auto-generated method stub
		return prodao.save(producto);
	}
	@Override
	@Transactional
	public void delete(Long id) {
		prodao.deleteById(id);
	}
	@Override
	@Transactional
	public void Update(Producto producto, long id) {
		prodao.findById(id).ifPresent((x)->{
			producto.setId(id);
			prodao.save(producto);
		});		// TODO Auto-generated method stub		
	}
	
}
