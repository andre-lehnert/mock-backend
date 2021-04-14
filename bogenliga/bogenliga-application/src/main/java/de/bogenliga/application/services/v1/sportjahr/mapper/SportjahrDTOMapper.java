package de.bogenliga.application.services.v1.sportjahr.mapper;
import de.bogenliga.application.business.sportjahr.api.types.SportjahrDO;
import de.bogenliga.application.common.service.mapping.DataTransferObjectMapper;
import de.bogenliga.application.services.v1.sportjahr.SportjahrDTO;
import java.util.function.*;

/**
 * Erstellt ein SportjahrDTO Objekt
 *
 * @author Philipp Schmidt
 */
public class SportjahrDTOMapper implements DataTransferObjectMapper {


    public static final Function<SportjahrDO, SportjahrDTO> toDTO = sportjahrDO -> {
        final Long id = sportjahrDO.getId();
        final Long sportjahr = sportjahrDO.getSportjahr();
        final Long version = sportjahrDO.getVersion();

        return new SportjahrDTO(id, sportjahr, version);
    };
}
