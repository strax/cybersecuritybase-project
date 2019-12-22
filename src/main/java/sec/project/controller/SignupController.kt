package sec.project.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import sec.project.domain.Signup
import sec.project.repository.SignupRepository

@Controller
class SignupController(@Autowired val signupRepository: SignupRepository) {
    @RequestMapping("*")
    fun defaultMapping(): String {
        return "redirect:/form"
    }

    @RequestMapping(value = ["/form"], method = [RequestMethod.GET])
    fun loadForm(): String {
        return "form"
    }

    @RequestMapping(value = ["/form"], method = [RequestMethod.POST])
    fun submitForm(@RequestParam name: String, @RequestParam address: String): String {
        signupRepository.save(Signup(name, address))
        return "done"
    }
}
