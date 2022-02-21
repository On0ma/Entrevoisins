package com.openclassrooms.entrevoisins.events;

import com.openclassrooms.entrevoisins.model.Neighbour;

public class ShowNeighbourEvent {

    public Neighbour neighbour;

    public ShowNeighbourEvent(Neighbour neighbour) {
        this.neighbour = neighbour;
    }
}
