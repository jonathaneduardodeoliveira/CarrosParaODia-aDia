package diadia.carro.model;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;
    private int ano;
    private String cor;

    @ManyToOne
    private Categoria categoria;

    private int quantidadeExistente;
    private int quantidadeDisponivel;
}
