package com.epam.service.impl;

import com.epam.service.dto.Event;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {

  List<Event> findAll();

  List<Event> findByTitle(String title);
}
