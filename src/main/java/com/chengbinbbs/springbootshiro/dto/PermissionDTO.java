package com.chengbinbbs.springbootshiro.dto;

import java.io.Serializable;

/**
 * @author zhangcb
 * @created 2017-12-12 15:35.
 */
public class PermissionDTO implements Serializable {

    private Long id;

    private String permission;

    private String description;

    private boolean hasPermission = false;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isHasPermission() {
        return hasPermission;
    }

    public void setHasPermission(boolean hasPermission) {
        this.hasPermission = hasPermission;
    }
}
