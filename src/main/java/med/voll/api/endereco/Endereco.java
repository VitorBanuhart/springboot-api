package med.voll.api.endereco;

import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {
    public Endereco() {}
    
    public Endereco(DadosEndereco endereco) {
        this.logradouro = endereco.logradouro();
        this.bairro = endereco.bairro();
        this.cep = endereco.cep();
        this.cidade = endereco.cidade();
        this.uf = endereco.uf();
        this.complemento = endereco.complemento();
        this.numero = endereco.numero();
    }
    private String logradouro;
    private String bairro;
    private String cep;
    private String cidade;
    private String numero;
    private String complemento;
    private String uf;
}
