package com.mywork.designpatterns.creational.factory;

public class EPlanFactory {

    //use getPlan method to get object of type EPlan
    public EPlan getEPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("DOMESTIC")) {
            return new DomesticEPlan();
        } else if (planType.equalsIgnoreCase("COMMERCIAL")) {
            return new CommercialEPlan();
        } else if (planType.equalsIgnoreCase("INSTITUTIONAL")) {
            return new InstitutionalEPlan();
        }
        return null;
    }
}//end of GetPlanFactory class.
