package sec.project.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import sec.project.HasLogger
import sec.project.domain.Event
import sec.project.logger
import sec.project.repository.EventsRepository

@Controller
@RequestMapping("/events")
class EventsController (@Autowired val eventsRepository: EventsRepository) : HasLogger {
    @GetMapping("/new")
    fun new(): String {
        return "/events/new"
    }

    @PostMapping
    fun create(event: Event): String {
        eventsRepository.save(event)
        logger().info("created event ${event.id}")
        return "redirect:/"
    }
}
