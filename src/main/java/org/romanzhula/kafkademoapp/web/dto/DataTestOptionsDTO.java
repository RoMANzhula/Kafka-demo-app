package org.romanzhula.kafkademoapp.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.romanzhula.kafkademoapp.model.enums.MeasurementType;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptionsDTO {

    private Integer delayInSecond;
    private MeasurementType[] measurementTypes;

}
