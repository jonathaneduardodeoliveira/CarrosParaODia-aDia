package diadia.carro.service;

import diadia.carro.model.Pessoa;
import diadia.carro.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa cadastrarPessoa(@Valid Pessoa pessoa) {

        if (LocalDate.now().getYear() - pessoa.getDataNascimento().getYear() < 18) {
            throw new RuntimeException("Apenas pessoas maiores de 18 anos podem ser cadastradas.");
        }
        return pessoaRepository.save(pessoa);
    }

    public List<Pessoa> listarPessoas() {
        return pessoaRepository.findAll();
    }

    public Pessoa buscarPorCpf(String cpf) {
        return pessoaRepository.findByCpf(cpf)
                .orElseThrow(() -> new RuntimeException("Pessoa não encontrada com o CPF: " + cpf));
    }
}
