package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjasController {

        @GetMapping("/boasvindas")
        public String boasVindas(){
            return "Essa e minha primeira mensagem nessa rota";
        }


        // Add Ninja
        @PostMapping("/criar")
        public String criarNinja(){ return "ninja criado"; }


        //Find Ninjas by ID
        @GetMapping("/todosID")
        public String mostrarTodosOsNinjasPorId(){ return "Mostrar ninja por ID"; }


        //Listar Ninjas
        @GetMapping("/todos")
        public String mostrarTodosOsNinjas(){ return "mostrar todos os ninjas"; }


        //Del ninja
        @DeleteMapping("/deletarID")
        public String deletarNinjaPorId(){ return "Deletar ninja por id"; }


        //Update Ninja
        @PutMapping("/alterarID")
        public String alterarNinjaPorId(){ return "Alterar ninja por ID"; }
}
