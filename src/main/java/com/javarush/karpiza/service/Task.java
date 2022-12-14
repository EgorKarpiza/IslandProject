package com.javarush.karpiza.service;

import com.javarush.karpiza.island.Island;
import com.javarush.karpiza.island.Location;


public record Task(Location location, Island island) implements Runnable {

    public Task(Location location, Island island) {
        this.location = location;
        this.island = island;

        location.addPlantsToList();
    }

    @Override
    public void run() {
        taskRunner();

    }

    private void taskRunner() {
        location.moveAnimals(island);
        location.eating();
        location.startReproduct();
    }
}