package meli.controllers;

import meli.dtos.GenDTO;
import meli.entities.Gen;
import meli.services.GenService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/mutant")
public class GenController {

    public GenService genService;

    public GenController(GenService genService) {
        this.genService = genService;
    }

    @GetMapping("/lista")
    @Transactional
    public ResponseEntity getAll() {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(genService.getAll());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body
                    ("{\"message\": \"Error. Registro NO encontrado.\"}");
        }
    }

    @GetMapping("/detalle/{id}")
    public ResponseEntity<GenDTO> getOne(@PathVariable int id) {
        GenDTO genDTO = genService.getOne(id);
        if(genDTO == null){
            return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(genDTO, HttpStatus.OK);
    }
    @PostMapping("/")
    @Transactional
    public ResponseEntity post(@RequestBody GenDTO dto) {
        try{
            if(genService.verificar(dto)){
                if (genService.isMutant(dto)) {
                    try {
                        genService.guardarMutante(dto,true);
                        return ResponseEntity.status(HttpStatus.OK).body("{\"message\": \"El individuo es mutante\"}");
                    } catch (Exception e) {
                        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                                .body("{\"message\": \"Error. Intente nuevamente.\"}");
                    }
                } else {
                    try {
                        genService.guardarMutante(dto, false);
                        return ResponseEntity.status(HttpStatus.FORBIDDEN).body("{\"message\": \"El individuo NO es mutante\"}");
                    } catch (Exception e) {
                        return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                                .body("{\"message\": \"Error. Intente nuevamente.\"}");
                    }
                }
            }else{
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body("{\"message\": \"Error. Intente nuevamente.\"}");
            }

        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("{\"message\": \"Error. Intente nuevamente.\"}");
        }


    }
    @PutMapping("/{id}")
    @Transactional
    public ResponseEntity put(@PathVariable int id, @RequestBody GenDTO dto) {

        try {
            return ResponseEntity.status(HttpStatus.OK).body(genService.update(id, dto));
        }catch(Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"message\":\"Error.\"}");
        }
    }

    @DeleteMapping("/borrar/{id}")
    @Transactional
    public ResponseEntity delete(@PathVariable int id) {
        try {
            System.out.println("Se recibió id:"+id);
            genService.delete(id);
            return ResponseEntity.status(HttpStatus.OK).body("{\"message\":\"Registro eliminado.\"}");
        }catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"message\":\"Error.\"}");
        }
    }




}
