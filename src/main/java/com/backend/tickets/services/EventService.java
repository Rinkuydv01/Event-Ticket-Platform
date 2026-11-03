package com.backend.tickets.services;

import com.backend.tickets.domain.CreateEventRequest;
import com.backend.tickets.domain.entities.Event;

import java.util.UUID;

public interface EventService {
    Event createEvent(UUID organizerId, CreateEventRequest eventRequest);
}
