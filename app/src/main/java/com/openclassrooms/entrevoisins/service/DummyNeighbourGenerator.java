package com.openclassrooms.entrevoisins.service;

import com.openclassrooms.entrevoisins.model.Neighbour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class DummyNeighbourGenerator {
    public static List<Neighbour> DUMMY_NEIGHBOURS = Arrays.asList(
            new Neighbour(1, "Caroline", "https://i.pravatar.cc/150?u=a042581f4e29026704d", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14",  "Lorem ipsum dolor sit amet. Aut velit facere aut sunt dolores ea laudantium eligendi hic veritatis architecto aut optio soluta. At aliquid facere ut deleniti fugiat eos eius iure in omnis rerum ut deleniti dignissimos qui quidem sequi. In beatae officia cumque voluptas non sunt voluptatum id repellat quisquam nam veritatis iusto rem eaque consectetur sit dolorem iste.\n" +
                    "\n" +
                    "Id natus minus est maxime aliquam ut aspernatur aperiam vel dolores tempore ex obcaecati dolores. A aliquid ipsum ex tenetur voluptatem nam laudantium doloremque cum dicta nihil.\n" +
                    "\n" +
                    "Id natus minus est maxime aliquam ut aspernatur aperiam vel dolores tempore ex obcaecati dolores. A aliquid ipsum ex tenetur voluptatem nam laudantium doloremque cum dicta nihil.\n" +
                    "\n" +
                    "Aut beatae reiciendis ad suscipit deleniti est mollitia quae ut necessitatibus quasi qui rerum eaque. Ut molestias velit est rerum nobis eum vero quas. Aut quasi quas qui quas quis non numquam voluptas qui recusandae nulla rem iusto dolores est ullam facere ut cupiditate velit. Qui nemo galisum vel ullam voluptates ipsam molestias.", "https://www.google.com/", false),
            new Neighbour(2, "Jack", "https://i.pravatar.cc/150?u=a042581f4e29026704e", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14",  "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..", "https://www.google.com/", false),
            new Neighbour(3, "Chloé", "https://i.pravatar.cc/150?u=a042581f4e29026704f", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14",  "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..", "https://www.google.com/", true),
            new Neighbour(4, "Vincent", "https://i.pravatar.cc/150?u=a042581f4e29026704a", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14",  "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..", "https://www.google.com/", false),
            new Neighbour(5, "Elodie", "https://i.pravatar.cc/150?u=a042581f4e29026704b", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14",  "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..", "https://www.google.com/", false),
            new Neighbour(6, "Sylvain", "https://i.pravatar.cc/150?u=a042581f4e29026704c", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14",  "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..", "https://www.google.com/", true),
            new Neighbour(7, "Laetitia", "https://i.pravatar.cc/150?u=a042581f4e29026703d", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14",  "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..", "https://www.google.com/", false),
            new Neighbour(8, "Dan", "https://i.pravatar.cc/150?u=a042581f4e29026703b", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14",  "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..", "https://www.google.com/", false),
            new Neighbour(9, "Joseph", "https://i.pravatar.cc/150?u=a042581f4e29026704d", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14",  "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..", "https://www.google.com/", false),
            new Neighbour(10, "Emma", "https://i.pravatar.cc/150?u=a042581f4e29026706d", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14",  "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..", "https://www.google.com/", false),
            new Neighbour(11, "Patrick", "https://i.pravatar.cc/150?u=a042581f4e29026702d", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14",  "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..", "https://www.google.com/", false),
            new Neighbour(12, "Ludovic", "https://i.pravatar.cc/150?u=a042581f3e39026702d", "Saint-Pierre-du-Mont ; 5km",
                    "+33 6 86 57 90 14",  "Bonjour !Je souhaiterais faire de la marche nordique. Pas initiée, je recherche une ou plusieurs personnes susceptibles de m'accompagner !J'aime les jeux de cartes tels la belote et le tarot..", "https://www.google.com/", false)
    );

    static List<Neighbour> generateNeighbours() {
        return new ArrayList<>(DUMMY_NEIGHBOURS);
    }
}
