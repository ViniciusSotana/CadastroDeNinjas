package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjasController {

        private NinjaService ninjaService;

        public NinjasController(NinjaService ninjaService) {
                this.ninjaService = ninjaService;
        }

        @GetMapping("/boasvindas")
        public String boasVindas(){
            return "Essa e minha primeira mensagem nessa rota";
        }


        // Add Ninja
        @PostMapping("/criar")
        public NinjaDTO criarNinja(@RequestBody NinjaDTO ninja){ return ninjaService.createNinja(ninja); }


        //Find Ninjas by ID
        @GetMapping("/listar/{id}")
        public NinjaModel listarNinjaById(@PathVariable Long id){ return ninjaService.listarNinjaById(id); }


        //Listar Ninjas
        @GetMapping("/listar")
        public List<NinjaModel> listarNinjas(){ return ninjaService.listarNinjas(); }


        //Del ninja
        @DeleteMapping("/deletar/{id}")
        public void deletarNinjaPorId(@PathVariable Long id){ ninjaService.deletarNinjaPorId(id); }


        //Update Ninja
        @PutMapping("/alterar/{id}")
        public NinjaModel alterarNinjaPorId(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado){
                return ninjaService.updateNinja(id, ninjaAtualizado);
        }
}
