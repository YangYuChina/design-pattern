package com.andy.factory;

import com.andy.domain.AirConditioning;
import com.andy.domain.Television;
import com.andy.factory.abstractfactory.ChangHongFactory;
import com.andy.factory.abstractfactory.HouseholdElectricalAppliancesFactory;
import com.andy.factory.abstractfactory.TclFactory;
import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void testCreateChangHongHouseholdElectricalAppliances(){
        HouseholdElectricalAppliancesFactory factory = new ChangHongFactory();
        privateTest(factory);
    }

    @Test
    public void testCreateTclElectricalAppliances(){
        HouseholdElectricalAppliancesFactory factory = new TclFactory();
        privateTest(factory);
    }

    private void privateTest(HouseholdElectricalAppliancesFactory factory){
        Television television = factory.createTelevision();
        AirConditioning airConditioning = factory.createAirConditioning();
        television.turnOn();
        airConditioning.turnOn();
        television.turnOff();
        airConditioning.turnOff();
    }
}
