package sec.project.repository

import org.springframework.data.jpa.repository.JpaRepository
import sec.project.domain.Signup

interface SignupRepository : JpaRepository<Signup, Long>
