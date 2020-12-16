package archandpattern.shedule.service;

import archandpattern.shedule.dto.ClientDTO;

import java.util.List;

public interface ClientService {
    List<ClientDTO> getAll();

    ClientDTO getById(Long id);

    ClientDTO save(ClientDTO clientDTO);

    void deleteById(Long id);

}