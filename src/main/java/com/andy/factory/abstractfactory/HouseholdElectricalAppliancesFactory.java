package com.andy.factory.abstractfactory;

import com.andy.domain.AirConditioning;
import com.andy.domain.Television;

public interface HouseholdElectricalAppliancesFactory {
    Television createTelevision();
    AirConditioning createAirConditioning();
}
