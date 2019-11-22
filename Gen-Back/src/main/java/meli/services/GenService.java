package meli.services;

import meli.dtos.GenDTO;
import meli.entities.Gen;
import meli.repositories.GenRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class GenService {

    @Autowired
    private GenRepository genRepository;

    public GenService(GenRepository genRepository) {
        this.genRepository = genRepository;
    }

    public ArrayList<Gen> getAll() {
        return (ArrayList<Gen>) genRepository.findAll();
    }

    public GenDTO getOne(int id) {
        Optional<Gen> genOptional = genRepository.findById(id);
        GenDTO genDTO = new GenDTO();
        try {
            Gen gen = genOptional.get();

            genDTO.setId(gen.getId());
            genDTO.setIndividuo(gen.getIndividuo());
            genDTO.setAdn(gen.getAdn());
            genDTO.setEsMutante(gen.isEsMutante());

        } catch (Exception e) {
            System.out.println(e.getMessage() + " Producido en el getOne de Gen");
        }
        return genDTO;
    }



    public GenDTO guardarMutante(GenDTO genDTO, boolean esMutante) {
        Gen gen = new Gen();

        try {
            gen.setIndividuo(genDTO.getIndividuo());
            gen.setAdn(genDTO.getAdn());
            gen.setEsMutante(esMutante);

            genRepository.save(gen);
            genDTO.setId(gen.getId());
        } catch (Exception e) {
            System.out.println(e.getMessage() + " Producido en el save de Gen");
        }
        return genDTO;
    }

    public GenDTO update(int id, GenDTO genDTO) {
        Optional<Gen> genOptional = genRepository.findById(id);
        Gen gen;
        try {
            gen = genOptional.get();
            gen.setIndividuo(genDTO.getIndividuo());
            gen.setAdn(genDTO.getAdn());
            gen.setEsMutante(genDTO.isEsMutante());
            genRepository.save(gen);
            genDTO.setId(gen.getId());
        } catch (Exception e) {
            System.out.println(e.getMessage() + " Producido en el update de Gen");
        }
        return genDTO;
    }

    public boolean delete(int id) {
        try {
            genRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println(e.getMessage() + " Producido en el delete de Gen");
            return false;
        }
        return true;
    }

    public boolean verificar(GenDTO genDTO){
        GenMatriz buscaGen = new GenMatriz();
        try{
            buscaGen.cuadrar(genDTO.getAdn());
        }catch (Exception e){
            return false;
        }
        return true;
    }
    public boolean isMutant(GenDTO genDTO){
        try {
            GenMatriz buscaGen = new GenMatriz();
            buscaGen.dimension(genDTO.getDimension());
            buscaGen.mostrarMatriz(genDTO.getAdn());
            boolean rA = buscaGen.resolver("AAAA");
            boolean rC = buscaGen.resolver("CCCC");
            boolean rG = buscaGen.resolver("GGGG");
            boolean rT = buscaGen.resolver("TTTT");

            return rA || rC || rG || rT;

        }catch (Exception e){
            System.out.println(e.getMessage() + " Producido al resolver la matriz del Gen");
            return false;
        }

    }


}
