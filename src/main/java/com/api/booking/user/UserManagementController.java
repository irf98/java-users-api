package com.api.booking.user;

import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("management/api/v1/users")
@AllArgsConstructor
public class UserManagementController {

    private final UserService userService;

    @GetMapping
    @PreAuthorize("hasAnyRole('ADMIN, MODERATOR')")
    public List<User> getUsers() {
        return userService.getUsers();
    }
}
