package ru.netology.manager;

import ru.netology.domain.BillboardPoster;

public class PosterManager {

    private BillboardPoster[] posters = new BillboardPoster[0];

    int limitFilmViewing = 10;

    public PosterManager(int number) {

        if (number >= 0) {
            limitFilmViewing = number;

        }
    }

    public PosterManager() {

    }


    public void addFilm(BillboardPoster poster) {

        int length = posters.length + 1;
        BillboardPoster[] tmp = new BillboardPoster[length];

        System.arraycopy(posters, 0, tmp, 0, posters.length);

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = poster;
        posters = tmp;
    }


    public BillboardPoster[] getAllFilms() {

        if (limitFilmViewing > posters.length) {

            limitFilmViewing = posters.length;
        }


        BillboardPoster[] result = new BillboardPoster[limitFilmViewing];

        for (int i = 0; i < result.length; i++) {
            int index = posters.length - i - 1;
            result[i] = posters[index];

        }

        return result;
    }
}




