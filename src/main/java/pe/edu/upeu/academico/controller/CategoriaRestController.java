package pe.edu.upeu.academico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.academico.entity.Categoria;
import pe.edu.upeu.academico.services.CategoriaService;
@CrossOrigin(origins = {"http://localhost:4200"})
@RestController
@RequestMapping("/api")
public class CategoriaRestController {
	@Autowired
	private CategoriaService categoriaService;
	
	@GetMapping("/categorias")
	public List<Categoria> readAll(){
		return categoriaService.findAll();
	}
	
	@GetMapping("categoria/{id}")
	public Categoria findById(@PathVariable(name = "id") Long id) {
		return categoriaService.findById(id);
	}
	
	@PostMapping("/categoria")
	public Categoria save(@RequestBody Categoria categoria) {
		return categoriaService.save(categoria);
	}
	
	@PutMapping("/categoria/{id}")
	public void update( @RequestBody Categoria categoria, @PathVariable(value = "id") long id) {
		categoriaService.Update(categoria, id);
	}
	
	@DeleteMapping("/categoria/{id}")
	public void delete(@PathVariable(name = "id") Long id) {
		categoriaService.delete(id);
	}
}
