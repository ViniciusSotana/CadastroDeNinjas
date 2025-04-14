package dev.java10x.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    @PostMapping("/criar")
    public String criarMissao(){
        return "missao criada";
    }

    @PutMapping("/alterar")
    public String alterarMissao(){
        return "missao alterada";
    }

    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "missao deletada";
    }

    @GetMapping("/listar")
    public String listarMissao(){
        return "Missoes listadas";
    }

}
