package com.example.securtiyyendim.Management;

import com.example.securtiyyendim.appuser.AppUser;
import com.example.securtiyyendim.appuser.AppUserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ManagementService {
private final AppUserRepository appUserRepository;

    public List<AppUser> getAllUsers() {
        return appUserRepository.findAll();

    }

    public void deleteAll() {
        appUserRepository.deleteAll();
    }
}
