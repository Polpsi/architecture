package archandpattern.shedule.service;

import archandpattern.shedule.dao.ClientDAO;
import archandpattern.shedule.domain.Client;
import archandpattern.shedule.dto.ClientDTO;
import archandpattern.shedule.mapper.ClientMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    private final ClientMapper mapper = ClientMapper.MAPPER;
    private final ClientDAO clientDAO;

    public ClientServiceImpl(ClientDAO clientDAO) {
        this.clientDAO=clientDAO;
    }

    @Override
    public List<ClientDTO> getAll() {
        return mapper.fromClientList(clientDAO.findAll());
    }

    @Override
    public ClientDTO getById(Long id) {
        return mapper.fromClient(clientDAO.findById(id).orElse(null));
    }

    @Override
    public ClientDTO save(ClientDTO clientDTO) {
        Client client = mapper.toClient(clientDTO);
        Client savedClient=clientDAO.save(client);
        return mapper.fromClient(savedClient);
    }

    public void deleteById(Long id) {
        clientDAO.deleteById(id);
    }
}