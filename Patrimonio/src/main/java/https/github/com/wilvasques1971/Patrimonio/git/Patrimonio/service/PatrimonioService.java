package https.github.com.wilvasques1971.Patrimonio.git.Patrimonio.service;


import https.github.com.wilvasques1971.Patrimonio.git.Patrimonio.model.Patrimonio;
import https.github.com.wilvasques1971.Patrimonio.git.Patrimonio.repository.PatrimonioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service


public class PatrimonioService {
     @Autowired

    private PatrimonioRepository repository;

     public List<Patrimonio>listarTodos(){
         return repository.findAll();

     }

     public Optional<Patrimonio>BuscarPorId(Lond Id){

         return  repository.findAllById(Id);
     }

     public  Patrimonio Salvar(Patrimonio patrimonio){

         return repository.save(patrimonio);
     }

     public  void Deletar(Long id){
         repository.deleteById(id);

     }





}
