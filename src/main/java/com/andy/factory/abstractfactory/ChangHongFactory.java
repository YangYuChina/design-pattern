package com.andy.factory.abstractfactory;

import com.andy.domain.AirConditioning;
import com.andy.domain.ChangHongAirConditioning;
import com.andy.domain.ChangHongTelevision;
import com.andy.domain.Television;

public class ChangHongFactory implements HouseholdElectricalAppliancesFactory {
    @Override
    public Television createTelevision() {
        return new ChangHongTelevision();
    }

    @Override
    public AirConditioning createAirConditioning() {
        return new ChangHongAirConditioning();
    }
}
