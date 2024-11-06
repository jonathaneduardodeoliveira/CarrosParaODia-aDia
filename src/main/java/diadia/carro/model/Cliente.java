package diadia.carro.model;

import lombok.Data;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import br.com.caelum.stella.bean.validation.CPF;
import java.time.LocalDate;

@Data
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nome;

    @CPF
    @NotBlank
    private String cpf;

    @Past
    private LocalDate dataNascimento;

    @NotBlank
    private String numeroHabilitacao;

    @Embedded
    private Endereco endereco;

    public Cliente() {

    }
}
