package sec.project.repository

import org.springframework.data.jpa.repository.JpaRepository
import sec.project.domain.Event

interface EventsRepository : JpaRepository<Event, Long>
