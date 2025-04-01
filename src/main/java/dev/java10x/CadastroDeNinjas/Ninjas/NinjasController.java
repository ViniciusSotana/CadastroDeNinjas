package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjasController {

        @GetMapping("/boasvindas")
        public String boasVindas(){
            return "Essa e minha primeira mensagem nessa rota";
        }

}
