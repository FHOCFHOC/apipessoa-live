package one.digitallinnovation.apipessoa.controller;


import one.digitallinnovation.apipessoa.dto.response.MensagemResponseDTO;
import one.digitallinnovation.apipessoa.entity.Pessoa;
import one.digitallinnovation.apipessoa.service.PessoaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/pessoa")
//@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PessoaController {

    private PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService){
        this.pessoaService = pessoaService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MensagemResponseDTO criarPessoa(@RequestBody Pessoa pessoa) {
        return pessoaService.criarPessoa(pessoa);
    }

    //@GetMapping
   // public String getBook(){
    //    return "Apir test";
    }
    //public List<PersonDTO> listAll() {
      //  return personService.listAll();
   // }

    //@GetMapping("/{id}")
    //public PersonDTO findById(@PathVariable Long id) throws PersonNotFoundException {
   //     return personService.findById(id);
   // }

  //  @PutMapping("/{id}")
   // public MessageResponseDTO updateById(@PathVariable Long id, @RequestBody @Valid PersonDTO personDTO) throws PersonNotFoundException {
    //    return personService.updateById(id, personDTO);
    //}

   // @DeleteMapping("/{id}")
   // @ResponseStatus(HttpStatus.NO_CONTENT)
   // public void deleteById(@PathVariable Long id) throws PersonNotFoundException {
   //     personService.delete(id);
   // }

