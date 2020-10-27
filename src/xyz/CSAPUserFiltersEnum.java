package xyz;

import java.util.Arrays;

public enum CSAPUserFiltersEnum {
	ROLEFILTER("RoleFilter",1),
	MANPRODUCT("ManProduct",2),
	MANREGION("ManRegion",3),
	MANFUNCTION("ManFunction",4);
    String filter;
    int filterId;


    CSAPUserFiltersEnum(String filter) {
        this.filter = filter;
    }
    CSAPUserFiltersEnum(String filter,int filterId) {
    	this(filter);
        this.filterId = filterId;
    }
    CSAPUserFiltersEnum(int filterId) {
    	
        this.filterId = filterId;
    }

    public static CSAPUserFiltersEnum findByFilterName(String filterName) throws Exception {
        return Arrays.stream(CSAPUserFiltersEnum.values())
                     .filter(r -> (r.filter.equals(filterName)))
                     .findFirst()
                     .orElseThrow(() -> new Exception(("CSAPUser filter does not exists.")));
    }
    public static int findByFilterId(String filterName) throws Exception {
        return Arrays.stream(CSAPUserFiltersEnum.values())
                     .filter(r -> (r.filter.equals(filterName)))
                     .findFirst().get().filterId;
    }

    public String getfilter() {
        return this.filter;
    }
    public int filterId() {
        return this.filterId;
    }
}
