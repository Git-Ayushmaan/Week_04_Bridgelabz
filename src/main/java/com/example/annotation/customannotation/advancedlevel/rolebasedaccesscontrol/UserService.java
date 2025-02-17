package com.example.annotation.customannotation.advancedlevel.rolebasedaccesscontrol;
public class UserService {

    @annotation.customannotation.advancedlevel.rolebasedaccesscontrol.RoleAllowed("ADMIN")
    public void performAdminTask() {
        System.out.println("Admin task performed!");
    }

    @annotation.customannotation.advancedlevel.rolebasedaccesscontrol.RoleAllowed("USER")
    public void performUserTask() {
        System.out.println("User task performed!");
    }
}
