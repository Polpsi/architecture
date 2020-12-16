package archandpattern.shedule.mapper;

import archandpattern.shedule.dto.ClientDTO;
import archandpattern.shedule.domain.Client;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ClientMapper {

    ClientMapper MAPPER = Mappers.getMapper(ClientMapper.class);

    Client toClient(ClientDTO clientDTO);

    ClientDTO fromClient(Client client);

    List<Client> toClientList(List<ClientDTO> clientDTOS);

    List<ClientDTO> fromClientList(List<Client> clientList);
}
