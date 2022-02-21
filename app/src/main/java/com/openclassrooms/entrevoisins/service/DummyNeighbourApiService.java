package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.ArrayList;
import java.util.List;

/**
 * Dummy mock for the Api
 */
public class DummyNeighbourApiService implements  NeighbourApiService {

    private List<Neighbour> neighbours = DummyNeighbourGenerator.generateNeighbours();

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Neighbour> getNeighbours() {
        return neighbours;
    }

    @Override
    public List<Neighbour> getFavoriteNeighbours() {
        List<Neighbour> favoritesNeighbours = new ArrayList<Neighbour>();
        for (Neighbour neighbour : neighbours) {
            if (neighbour.getIsFavorite()) {
                favoritesNeighbours.add(neighbour);
            }
        }
        return favoritesNeighbours;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteNeighbour(Neighbour neighbour) {
        neighbours.remove(neighbour);
    }

    /**
     * {@inheritDoc}
     * @param neighbour
     */
    @Override
    public void createNeighbour(Neighbour neighbour) {
        neighbours.add(neighbour);
    }

    @Override
    public void setFavorite(Neighbour neighbour) {
        int neighbourPos = neighbours.indexOf(neighbour);
        neighbours.set(neighbourPos, neighbour);
    }
}
