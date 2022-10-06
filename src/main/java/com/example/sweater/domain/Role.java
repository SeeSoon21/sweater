package com.example.sweater.domain;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    USER, ADMIN, PENISILIN;
    @Override
    public String getAuthority(){
        return name(); //return name of the enum constant
    }
}
