package sead.rn.gov.br.projeto_web.model.generic;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
@Data
@AllArgsConstructor
@Audited
public abstract class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Version
    public int version;
    public LocalDateTime createdAt;
    public LocalDateTime updatedAt;
    public LocalDateTime deleteAt;

    public BaseEntity() {
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.deleteAt = LocalDateTime.now();
    }

    // getters and setters
}