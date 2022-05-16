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
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Audited
@Table(name = "pessoafisica")
@AuditTable(value = "pessoafisica_audit")
public class PessoaFisica extends Pessoa implements Serializable{

//    @OneToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "pessoa_id")
//    Pessoa pessoa;
    private static final long serialVersionUID = 1L;

    @Column(name = "CPF")
    private String cpf;
    @Column(name = "RG")
    private String rg;
    @Column(name = "DATA_NASCIMENTO")
    private Date dataNascimento;
    @Column(name = "NOME_MAE")
    private String nomeMae;
    @Column(name = "NOME_PAI")
    private String nomePai;

    @OneToMany(mappedBy="pessoaFisica") //bidirectional with deficiencia
    private List<Deficiencia> deficiencia;

    @ManyToMany(cascade = CascadeType.ALL) //With Endereco
    @JoinTable(
            name = "pessoafisica_endereco",
            joinColumns = @JoinColumn(name="id_pessoafisica"),
            inverseJoinColumns =  @JoinColumn(name = "id_endereco"))
    private List<Endereco> enderecoPessoaList = new ArrayList<Endereco>();

    public PessoaFisica(Integer id, String nome, String email, String cpf, String rg, Date dataNascimento, String nomeMae, String nomePai) {
        super(nome, email);
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
    }
}
