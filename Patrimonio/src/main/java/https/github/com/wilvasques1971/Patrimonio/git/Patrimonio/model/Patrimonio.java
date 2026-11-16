package https.github.com.wilvasques1971.Patrimonio.git.Patrimonio.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_patrimonio")

public class Patrimonio {
    public Patrimonio() {

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNr_patrimonio() {
        return nr_patrimonio;
    }

    public void setNr_patrimonio(String nr_patrimonio) {
        this.nr_patrimonio = nr_patrimonio;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String local) {
        Local = local;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "nr_patrimonio", nullable = false, length = 50)
    private String nr_patrimonio;

    @Column(name = "Local", nullable = false, length = 255)

    private String Local;

    @Column(name = "descricao", nullable = false, length = 255)
    private String descricao;


    public Patrimonio(Long id, String nr_patrimonio, String local, String descricao) {
        Id = id;
        this.nr_patrimonio = nr_patrimonio;
        Local = local;
        this.descricao = descricao;
    }
}


