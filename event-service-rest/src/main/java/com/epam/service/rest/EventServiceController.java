package com.epam.service.rest;

import com.epam.service.api.EventService;
import com.epam.service.dto.Event;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Api("Rest API")
@RestController
@RequiredArgsConstructor
@RequestMapping("api/event")
public class EventServiceController {

  private final EventService eventService;

  @ApiOperation("Get all events")
  @GetMapping
  @ResponseStatus(HttpStatus.OK)
  public List<Event> getEvents() {
    return eventService.getAllEvents();
  }

  @ApiOperation("Create event")
  @PostMapping
  @ResponseStatus(HttpStatus.OK)
  public void createEvent(@RequestBody Event event) {
    eventService.createEvent(event);
  }

  @ApiOperation("Update event")
  @PutMapping
  @ResponseStatus(HttpStatus.OK)
  public void updateEvent(@RequestBody Event event) throws NotFoundException {
    eventService.getEvent(event.getId());
    eventService.updateEvent(event);
  }

  @ApiOperation("Delete event")
  @DeleteMapping
  @ResponseStatus(HttpStatus.OK)
  public void deleteEvent(@RequestParam Long id) throws NotFoundException {
    Event event = eventService.getEvent(id);
    eventService.deleteEvent(event);
  }
}
