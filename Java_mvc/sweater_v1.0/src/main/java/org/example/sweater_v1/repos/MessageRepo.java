package org.example.sweater_v1.repos;

import org.example.sweater_v1.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Integer> {
}
