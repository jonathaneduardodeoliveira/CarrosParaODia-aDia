package diadia.carro.model;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroIdentificacao;
    private String descricao;
    private double preco;
}
