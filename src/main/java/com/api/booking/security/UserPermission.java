package com.api.booking.security;

import lombok.Getter;
import lombok.AllArgsConstructor;

@Getter
@AllArgsConstructor
public enum UserPermission {
    USER_READ("user:read"),
    USER_WRITE("user:write");

    private final String permission;
}
