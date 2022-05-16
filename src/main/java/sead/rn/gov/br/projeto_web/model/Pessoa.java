package sead.rn.gov.br.projeto_web.model;

import lombok.*;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;
import sead.rn.gov.br.projeto_web.model.generic.BaseEntity;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Audited
@MappedSuperclass
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Pessoa extends BaseEntity {

    @Column(name = "NOME", length = 50, nullable = false)
    String nome;
    @Column(name = "EMAIL", length = 50, nullable = false)
    String email;
}
