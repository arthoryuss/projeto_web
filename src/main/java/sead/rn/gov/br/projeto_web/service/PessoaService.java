//package sead.rn.gov.br.projeto_web.service;
//
//import org.springframework.stereotype.Service;
//import sead.rn.gov.br.projeto_web.model.Pessoa;
//import sead.rn.gov.br.projeto_web.repository.PessoaFisicaRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class PessoaService {
//
//    PessoaFisicaRepository repository;
//
//    PessoaService(PessoaFisicaRepository repository){
//        this.repository = repository;
//    }
//
//    public Pessoa insert(Pessoa p){
//        return repository.save(p);
//    }
//
//    public Pessoa update(Pessoa p){
//        return repository.save(p);
//    }
//
//    public Optional<Pessoa> findById(Long id){
//        return repository.findById(id);
//    }
//    public Pessoa saveAndFlush(Pessoa c){
//        return repository.saveAndFlush(c);
//    }
//    public List<Pessoa> listAll(){
//        return repository.findAll();
//    }
//}
