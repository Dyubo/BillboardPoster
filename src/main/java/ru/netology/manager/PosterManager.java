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

        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }

        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = poster;
        posters = tmp;
    }


    public BillboardPoster[] getAllFilms() {
        int lenght;


        if (limitFilmViewing <= posters.length) {

            lenght = limitFilmViewing;
        } else  {

            lenght = posters.length;
        }

        BillboardPoster[] result = new BillboardPoster[lenght];

        for (int i = 0; i < result.length; i++) {
            int index = posters.length - i - 1;
            result[i] = posters[index];

        }

        return result;
    }
}




