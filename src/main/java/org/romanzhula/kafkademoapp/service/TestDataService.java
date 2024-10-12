package org.romanzhula.kafkademoapp.service;

import org.romanzhula.kafkademoapp.model.DataTestOptions;
import org.springframework.stereotype.Service;

@Service
public interface TestDataService {

    void sendMessages(DataTestOptions dataTestOptions);

}
