package sec.project.domain

import org.springframework.data.jpa.domain.AbstractPersistable
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Signup(
        val name: String,
        val address: String
) : AbstractPersistable<Long>()
