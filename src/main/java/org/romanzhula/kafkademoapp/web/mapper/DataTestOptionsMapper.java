package org.romanzhula.kafkademoapp.web.mapper;

import org.mapstruct.Mapper;
import org.romanzhula.kafkademoapp.model.DataTestOptions;
import org.romanzhula.kafkademoapp.web.dto.DataTestOptionsDTO;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper extends Mappable<DataTestOptions, DataTestOptionsDTO> {
}
