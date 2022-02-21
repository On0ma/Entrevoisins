package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.di.DI;
import com.openclassrooms.entrevoisins.model.Neighbour;

import org.hamcrest.collection.IsIterableContainingInAnyOrder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThat;

/**
 * Unit test on Neighbour service
 */
@RunWith(JUnit4.class)
public class NeighbourServiceTest {

    private NeighbourApiService service;

    @Before
    public void setup() {
        service = DI.getNewInstanceApiService();
    }

    @Test
    public void getNeighboursWithSuccess() {
        List<Neighbour> neighbours = service.getNeighbours();
        List<Neighbour> expectedNeighbours = DummyNeighbourGenerator.DUMMY_NEIGHBOURS;
        assertThat(neighbours, IsIterableContainingInAnyOrder.containsInAnyOrder(expectedNeighbours.toArray()));
    }

    @Test
    public void deleteNeighbourWithSuccess() {
        Neighbour neighbourToDelete = service.getNeighbours().get(0);
        service.deleteNeighbour(neighbourToDelete);
        assertFalse(service.getNeighbours().contains(neighbourToDelete));
    }

    @Test
    public void getFavoriteNeighboursWithSuccess() {
        List<Neighbour> favoriteNeighbours = service.getFavoriteNeighbours();
        boolean hasFavorite = favoriteNeighbours.stream().allMatch(s -> s.getIsFavorite());
        assertTrue(hasFavorite);
    }

    @Test
    public void setFavoriteWithSuccess() {
        List<Neighbour> neighbours = service.getNeighbours();
        Neighbour neighbourToSetFavorite = service.getNeighbours().get(0);
        neighbourToSetFavorite.setIsFavorite(true);
        service.setFavorite(neighbourToSetFavorite);
        assertTrue(neighbours.get(0).getIsFavorite());
    }

    @Test
    public void createNeighbourWithSuccess() {
        List<Neighbour> neighbours = service.getNeighbours();
        Neighbour neighbour = new Neighbour(13, "Pierre",
                "https://i.pravatar.cc/150?u=a042581f3e39026702d",
                "Saint-Pierre-du-Mont ; 5km",
                "+33 6 86 57 90 14",
                "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..",
                "https://www.google.com/", false);
        service.createNeighbour(neighbour);
        assertTrue(neighbours.contains(neighbour));
    }
}
