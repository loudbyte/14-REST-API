package com.epam.service.impl;

import com.epam.service.api.EventService;
import com.epam.service.dto.Event;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EventServiceImpl implements EventService {

  private final EventRepository eventRepository;

  @Override
  public void createEvent(Event event) {
    eventRepository.save(event);
  }

  @Override
  public void updateEvent(Event event) {
    eventRepository.save(event);
  }

  @Override
  public Event getEvent(Long id) {
    return eventRepository.findById(id).orElse(null);
  }

  @Override
  public void deleteEvent(Event event) {
    eventRepository.delete(event);
  }

  @Override
  public List<Event> getAllEvents() {
    return eventRepository.findAll();
  }

  @Override
  public List<Event> getAllEventsByTitle(String title) {
    return eventRepository.findByTitle(title);
  }
}
