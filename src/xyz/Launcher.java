package xyz;

public class Launcher {

	public static void main(String[] args) {
System.out.println(CSAPUserFiltersEnum.ROLEFILTER.getfilter());
System.out.println(CSAPUserFiltersEnum.ROLEFILTER.name());
try {
	System.out.println(CSAPUserFiltersEnum.findByFilterId(CSAPUserFiltersEnum.ROLEFILTER.getfilter()));
	System.out.println(CSAPUserFiltersEnum.findByFilterId(CSAPUserFiltersEnum.MANPRODUCT.getfilter()));
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	}

}
