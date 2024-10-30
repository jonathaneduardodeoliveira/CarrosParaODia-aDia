package diadia.carro.model;

import lombok.Data;
import jakarta.persistence.Embeddable;

@Data
@Embeddable
public class Endereco {

    private String rua;
    private String cidade;
    private String estado;
    private String cep;
}
