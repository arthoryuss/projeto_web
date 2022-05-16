package sead.rn.gov.br.projeto_web.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Audited
@Table(name = "pessoajuridica")
@AuditTable(value = "pessoajuridica_audit")
public class PessoaJuridica extends Pessoa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "CNPJ")
    private String cnpj;
    @Column(name = "SITUACAO_FUNCIONAMENTO")
    private Boolean situacaoFuncionamento;

    public PessoaJuridica(Integer id, String nome, String email, String cnpj, Boolean situacaoFuncionamento) {
        super(nome, email);
        this.cnpj = cnpj;
        this.situacaoFuncionamento = situacaoFuncionamento;
    }

    @OneToOne
    @JoinColumn(name = "id_endereco")
    private Endereco endereco;

    @Override
    public String toString() {
        return "PessoaJuridica [id=" + id + "]";
    }
}
