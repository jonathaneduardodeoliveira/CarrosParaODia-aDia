package diadia.carro.service;

import diadia.carro.model.Categoria;
import diadia.carro.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    private final CategoriaRepository categoriaRepository;

    @Autowired
    public CategoriaService(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public Categoria salvarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }

    public Categoria buscarCategoriaPorId(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    public void excluirCategoria(Long id) {
        categoriaRepository.deleteById(id);
    }
}
