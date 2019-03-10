package com.andy.factory.abstractfactory;

import com.andy.domain.AirConditioning;
import com.andy.domain.TclAirConditioning;
import com.andy.domain.TclTelevision;
import com.andy.domain.Television;

public class TclFactory implements HouseholdElectricalAppliancesFactory {
    @Override
    public Television createTelevision() {
        return new TclTelevision();
    }

    @Override
    public AirConditioning createAirConditioning() {
        return new TclAirConditioning();
    }
}
