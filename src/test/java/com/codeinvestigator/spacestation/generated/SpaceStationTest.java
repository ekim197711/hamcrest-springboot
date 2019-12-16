package com.codeinvestigator.spacestation.generated;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpaceStationTest {


    Captain createCaptain() {
        Captain.Builder builder = Captain.newBuilder();
        Captain captain = builder
                .setName("test123")
                .setRace(Captain.RaceType.SMALL_ROUND)
                .build();

        assertNotNull(captain);
        assertNotNull(captain.getName());
        assertNotNull(captain.getRace());
        assertEquals(Captain.RaceType.SMALL_ROUND, captain.getRace());
        return captain;
    }

    SpaceShip ship(String name){
        return SpaceShip.newBuilder()
                .setName(name)
                .setCrew(10)
                .setCargo("Robot parts").build();
    }

    @Test
    void spacestation() {
        SpaceStation spacestation = SpaceStation.newBuilder()
                .addSpaceships(ship("Hawk"))
                .addSpaceships(ship("Seagul"))
                .setCaptain(createCaptain()).build();

        System.out.println(String.format("SpaceStation: %s", spacestation));
        System.out.println(String.format("SpaceStation Captain Name: %s",
                spacestation.getCaptain().getName()));

        spacestation.getSpaceshipsList().forEach(System.out::println);

    }

}