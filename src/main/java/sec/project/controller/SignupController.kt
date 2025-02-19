package sec.project.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import sec.project.domain.Signup
import sec.project.repository.SignupRepository

@Controller
@RequestMapping("/signups")
class SignupController(@Autowired val signupRepository: SignupRepository) {
    @RequestMapping(method = [RequestMethod.GET])
    fun get(): String {
        return "form"
    }

    @RequestMapping(method = [RequestMethod.POST])
    fun post(@RequestParam name: String, @RequestParam address: String): String {
        signupRepository.save(Signup(name, address))
        return "done"
    }
}
