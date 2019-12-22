package sec.project.domain

import org.springframework.data.jpa.domain.AbstractPersistable
import org.springframework.security.core.userdetails.User
import java.time.LocalDateTime
import javax.persistence.Entity

@Entity
data class Event(
        val name: String,
        val username: String
) : AbstractPersistable<Long>()
