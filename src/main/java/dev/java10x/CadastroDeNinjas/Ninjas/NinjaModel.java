package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class  NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Integer idade;

    @Column(unique = true)
    private String email;

    @Column(name = "Imagem_URL")
    private String imgUrl;

    /*@ManyToOne Um ninja pra uma unica Missão*/
    @ManyToOne
    @JoinColumn(name = "missoes_id") /*Foreign key*/
    private MissoesModel missoes;




}
