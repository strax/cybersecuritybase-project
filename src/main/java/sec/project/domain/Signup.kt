package sec.project.domain

import org.springframework.data.jpa.domain.AbstractPersistable
import javax.persistence.Entity

@Entity
data class Signup(
        val name: String,
        val address: String
) : AbstractPersistable<Long>()
