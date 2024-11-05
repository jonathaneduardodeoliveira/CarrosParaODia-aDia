package diadia.carro.service;

import diadia.carro.model.Veiculo;
import diadia.carro.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeiculoService {

    private final VeiculoRepository veiculoRepository;

    @Autowired
    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    public Veiculo salvarVeiculo(Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

    public List<Veiculo> listarVeiculos() {
        return veiculoRepository.findAll();
    }

    public Veiculo buscarVeiculoPorId(Long id) {
        return veiculoRepository.findById(id).orElse(null);
    }

    public void excluirVeiculo(Long id) {
        veiculoRepository.deleteById(id);
    }
}
