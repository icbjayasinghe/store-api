package com.skyhigh.storeapi.util;

import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class RoleFilterUtil {
    public List<String> filterAppRole(Set<String> roles) {
        List<String> filteredRoles= roles.stream()
                .filter(role -> role.startsWith("app"))
                .map(role -> {
                            if (role.equals("app-store-admin")) {
                                return "Admin";
                            } else
                                return null;
                            })
                .collect(Collectors.toList());
        return filteredRoles;

    }
}
