package sec.project

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import sec.project.domain.Event
import sec.project.repository.EventsRepository

@SpringBootApplication
open class CyberSecurityBaseProjectApplication : HasLogger {
    @Bean
    open fun init(@Autowired eventsRepository: EventsRepository) = ApplicationRunner {
        logger().warn("Seeding sample data")
        eventsRepository.save(Event(name = "Event 1"))
        eventsRepository.save(Event(name = "Event 2"))
    }
}

fun main(args: Array<String>) {
    runApplication<CyberSecurityBaseProjectApplication>(*args)
}
