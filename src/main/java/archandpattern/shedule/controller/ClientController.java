package archandpattern.shedule.controller;

import archandpattern.shedule.dto.ClientDTO;
import archandpattern.shedule.dto.EntityNotFoundResponse;
import archandpattern.shedule.exception.EntityNotFoundException;
import archandpattern.shedule.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService=clientService;
    }

    @GetMapping
    public List<ClientDTO> getClientList(){
        return clientService.getAll();
    }

    @GetMapping("/{id}")
    public ClientDTO getClientById(@PathVariable Long id) {
        checkById(id);
        return clientService.getById(id);
    }

    @PostMapping("/")
    public ClientDTO createClient(@RequestBody ClientDTO clientdto) {
        return clientService.save(clientdto);
    }

    @PutMapping("/{id}")
    public ClientDTO updateProduct(@RequestBody ClientDTO clientDTO, @PathVariable(name = "id") Long id){
        checkById(id);
        System.out.println(id);
        clientDTO.setId(id);
        System.out.println(clientDTO.getId() + " " + clientDTO.getName() +" "+clientDTO.getSurname());
        return clientService.save(clientDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteClient(@PathVariable Long id){
        checkById(id);
        clientService.deleteById(id);
    }

    private void checkById(@PathVariable Long id) throws EntityNotFoundException {
        if(clientService.getById(id)==null){
            throw new EntityNotFoundException("Client", id, "not found");
        }
    }

    @ExceptionHandler
    public ResponseEntity<EntityNotFoundResponse> handleException(EntityNotFoundException ex){
        EntityNotFoundResponse response = new EntityNotFoundResponse();
        response.setEntityName(ex.getEntityName());
        response.setEntityId(ex.getEntityId());
        response.setMessage(ex.getMessage());
        response.setStatus(HttpStatus.NOT_FOUND.value());
        response.setTimestamp(System.currentTimeMillis());
        return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
    }
}
