package xyz;

import java.util.Arrays;
import java.util.Optional;






public enum CSAPUserRolesEnum {
    NOACCESS("NoAccess", 1),
    CLIENT("Client", 2),
    ASSESSMENT("Assessment", 3),
    CONSULTANT("Consultant", 4),
    ACCOUNTMANAGER("AccountManager", 5),
    POWERUSER("PowerUser", 6),
    ADMIN("Admin", 7);
    String role;
    int roleId;

    CSAPUserRolesEnum(String role) {
        this.role = role;
    }

    CSAPUserRolesEnum(int roleId) {
        this.roleId = roleId;
    }

    CSAPUserRolesEnum(String role, int roleId) {
        this(role);
        this.roleId = roleId;
    }

    public static CSAPUserRolesEnum findByRoleName(String roleName) throws Exception {
        return Arrays.stream(CSAPUserRolesEnum.values())
                     .filter(r -> (r.role.equals(roleName)))
                     .findFirst()
                     .orElseThrow(() -> new Exception(("CSAPUser role does not exists.")));
    }

    public static int findByRoleNameAndReturnRoleId(String roleName) throws Exception {
        Optional<CSAPUserRolesEnum> optionalCSAPUserRolesEnum = Arrays.stream(CSAPUserRolesEnum.values())
                                                                      .filter(r -> (r.role.equals(roleName)))
                                                                      .findFirst();
        if (optionalCSAPUserRolesEnum.isPresent()) {
            CSAPUserRolesEnum cSAPUserRolesEnum = optionalCSAPUserRolesEnum.get();
            return cSAPUserRolesEnum.getRoleId();
        } else {
            System.out.println("Role not found in the CSAPUserRolesEnum {}"+ roleName);
            throw new Exception("Role not found in the CSAPUserRolesEnum");
        }
    }

    public String getRole() {
        return this.role;
    }

    public int getRoleId() {
        return this.roleId;
    }
}
