package xyz;

public class LauncherCsap {

	public static void main(String[] args) {
		System.out.println(CSAPUserRolesEnum.CONSULTANT.name() +" "+CSAPUserRolesEnum.CONSULTANT);
		/*System.out.println(CSAPUserRolesEnum.NOACCESS.getRole() +" "+CSAPUserRolesEnum.CLIENT.getRole());
		try {
			System.out.println(CSAPUserRolesEnum.findByRoleNameAndReturnRoleId(CSAPUserRolesEnum.NOACCESS.getRole()));
			System.out.println(CSAPUserRolesEnum.findByRoleNameAndReturnRoleId(CSAPUserRolesEnum.CLIENT.getRole()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/


	}

}
