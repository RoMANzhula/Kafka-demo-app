package org.romanzhula.kafkademoapp.service;

import org.romanzhula.kafkademoapp.model.Data;

public interface KafkaDataService {

    void send(Data data);

}
