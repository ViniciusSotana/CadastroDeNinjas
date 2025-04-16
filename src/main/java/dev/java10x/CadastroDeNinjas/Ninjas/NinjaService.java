package dev.java10x.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //Listar todos os ninjas
    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }

    public NinjaModel listarNinjaById(Long id) {
        /*Optional<NinjaModel> optional = ninjaRepository.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;*/

        return ninjaRepository.findById(id).orElse(null);

    }

}
