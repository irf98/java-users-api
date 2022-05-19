package com.api.booking.user;

import com.api.booking.security.UserPermission;
import com.google.common.collect.Sets;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Set;

@Getter
@AllArgsConstructor
public enum UserRole {
    USER(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(UserPermission.USER_READ, UserPermission.USER_WRITE)),
    MODERATOR(Sets.newHashSet(UserPermission.USER_READ));

    private final Set<UserPermission> permissions;
}
