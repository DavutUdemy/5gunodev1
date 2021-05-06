package com.example.securtiyyendim.registration;

import com.example.securtiyyendim.appuser.AppUser;
import com.example.securtiyyendim.appuser.AppUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;
private final AppUserRepository appUserRepository;
@GetMapping
public List<AppUser> getAllUsers(){
    return appUserRepository.findAll();
}
    @PostMapping
    public String register(@RequestBody RegistrationRequest request) {
        return registrationService.register(request);
    }

    @GetMapping(path = "confirm")
    public String confirm(@RequestParam("token") String token) {
        return registrationService.confirmToken(token);
    }

}
