package org.romanzhula.kafkademoapp.web.mapper;

import org.mapstruct.Mapper;
import org.romanzhula.kafkademoapp.model.Data;
import org.romanzhula.kafkademoapp.web.dto.DataDTO;

@Mapper(componentModel = "spring")
public interface DataMapper extends Mappable<Data, DataDTO> {

}
