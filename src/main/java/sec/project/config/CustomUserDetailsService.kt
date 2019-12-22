package sec.project.config

import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service
import java.util.*
import javax.annotation.PostConstruct

@Service
class CustomUserDetailsService : UserDetailsService {
    private val accountDetails: MutableMap<String, String> = TreeMap()

    @PostConstruct
    fun init() { // this data would typically be retrieved from a database
        accountDetails["ted"] = "$2a$06\$rtacOjuBuSlhnqMO2GKxW.Bs8J6KI0kYjw/gtF0bfErYgFyNTZRDm"
    }

    @Throws(UsernameNotFoundException::class)
    override fun loadUserByUsername(username: String): UserDetails {
        if (!accountDetails.containsKey(username)) {
            throw UsernameNotFoundException("No such user: $username")
        }
        return User(
                username,
                accountDetails[username],
                true,
                true,
                true,
                true,
                Arrays.asList(SimpleGrantedAuthority("USER")))
    }
}
