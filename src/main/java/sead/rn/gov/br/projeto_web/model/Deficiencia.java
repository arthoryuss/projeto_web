package sead.rn.gov.br.projeto_web.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;
import sead.rn.gov.br.projeto_web.model.generic.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class Deficiencia extends BaseEntity {
    @Column(name = "TIPO_DEFICIENCIA")
    private String tipoDeficiencia;
    @Column(name = "LAUDO_MEDICO")
    private String laudoMedico;
    @JoinColumn(name = "ID_PESSOA_FISICA", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private PessoaFisica pessoaFisica;

    @Override
    public String toString() {
        return "Deficiencia [id=" + id + "]";
    }
}
