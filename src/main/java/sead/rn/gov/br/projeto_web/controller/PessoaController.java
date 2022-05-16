//package sead.rn.gov.br.projeto_web.controller;
//
//import ch.qos.logback.core.net.server.Client;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import sead.rn.gov.br.projeto_web.model.Pessoa;
//import sead.rn.gov.br.projeto_web.service.PessoaService;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/pessoas")
//public class PessoaController {
//
//    private PessoaService service;
//
//    PessoaController(PessoaService service){
//        this.service = service;
//    }
//
//    @GetMapping
//    public List<Pessoa> listAll(){
//        return service.listAll();
//    }
//
//    @GetMapping(path = {"/{id}"})
//    public ResponseEntity<Pessoa> getOne(@PathVariable Long id){
//        Optional<Pessoa> pessoa = service.findById(id);
//
//        if (pessoa.isEmpty()){
//            return ResponseEntity.notFound().build();
//        }else{
//            return ResponseEntity.ok(pessoa.get());
//        }
//    }
//
//    @PostMapping
//    public ResponseEntity<Pessoa> insert(@RequestBody Pessoa p){
//        Pessoa pessoa = service.insert(p);
//        return ResponseEntity.status(201).body(pessoa);
//    }
//
//    @PutMapping(path = {"/{id}"})
//    public ResponseEntity<Pessoa> update(@PathVariable Long id, @RequestBody Pessoa p){
//        return service.findById(id)
//                .map( record -> {
//                    service.saveAndFlush(p);
//                    return ResponseEntity.ok(p);
//                }).orElse(ResponseEntity.notFound().build());
//    }
//}
