package sec.project.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import sec.project.repository.EventsRepository

@Controller
class IndexController(@Autowired val eventsRepository: EventsRepository) {
    @GetMapping("/")
    fun index(model: Model): String {
        model["events"] = eventsRepository.findAll()
        return "index"
    }
}
