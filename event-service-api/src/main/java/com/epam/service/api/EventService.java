package com.epam.service.api;

import com.epam.service.dto.Event;
import java.util.List;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

public interface EventService {

  void createEvent(Event event);
  void updateEvent(Event event);
  Event getEvent(Long id) throws NotFoundException;
  void deleteEvent(Event event);
  List<Event> getAllEvents();
  List<Event> getAllEventsByTitle(String title);

}
