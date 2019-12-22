package sec.project.domain

import org.springframework.data.jpa.domain.AbstractPersistable
import java.time.LocalDateTime
import javax.persistence.Entity

@Entity
data class Event(
        val name: String
) : AbstractPersistable<Long>()
