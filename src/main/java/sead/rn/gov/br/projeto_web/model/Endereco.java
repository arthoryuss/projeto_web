package sead.rn.gov.br.projeto_web.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;
import sead.rn.gov.br.projeto_web.model.generic.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "endereco")
@Audited
@AuditTable(value = "endereco_audit")
public class Endereco extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @Column(name = "LOGRADOURO")
    private String logradouro;
    @Column(name = "NUMERO")
    private String numero;
    @Column(name = "COMPLEMENTO")
    private String complemento;
    @Column(name = "BAIRRO")
    private String bairro;
    @Column(name = "CIDADE")
    private String cidade;
    @Column(name = "CEP")
    private String cep;
    @Column(name = "UF")
    private String uf;

    @ManyToMany(mappedBy = "enderecoPessoaList")
    private List<PessoaFisica> pessoaFisicaList = new ArrayList<PessoaFisica>();
    @OneToOne(mappedBy = "endereco")
    private PessoaJuridica pessoaJuridica;
}
