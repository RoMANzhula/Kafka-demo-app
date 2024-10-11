package org.romanzhula.kafkademoapp.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.romanzhula.kafkademoapp.model.enums.MeasurementType;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptions {

    private Integer delayInSecond;
    private MeasurementType[] measurementTypes;

}
