package com.example.securtiyyendim.Management;

import com.example.securtiyyendim.appuser.AppUser;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
@AllArgsConstructor
@RequestMapping("api/v1/management")
public class ManagementController {
    private final ManagementService managementService;
    @GetMapping
    public List<AppUser> getAllUsers(){
        return managementService.getAllUsers();
    }
    @DeleteMapping
    public void deleteAllUsers(){
        managementService.deleteAll();
    }

}
