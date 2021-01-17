package ru.netology;
import org.junit.jupiter.api.Test;
import ru.netology.domain.BillboardPoster;
import ru.netology.manager.PosterManager;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BillboardTest {
    BillboardPoster filmAdd1 = new BillboardPoster(1, "title1", "genre1");
    BillboardPoster filmAdd2 = new BillboardPoster(2, "title2", "genre2");
    BillboardPoster filmAdd3 = new BillboardPoster(3, "title3", "genre3");
    BillboardPoster filmAdd4 = new BillboardPoster(4, "title4", "genre4");
    BillboardPoster filmAdd5 = new BillboardPoster(5, "title5", "genre5");
    BillboardPoster filmAdd6 = new BillboardPoster(6, "title6", "genre6");
    BillboardPoster filmAdd7 = new BillboardPoster(7, "title7", "genre7");
    BillboardPoster filmAdd8 = new BillboardPoster(8, "title8", "genre8");
    BillboardPoster filmAdd9 = new BillboardPoster(9, "title9", "genre9");
    BillboardPoster filmAdd10 = new BillboardPoster(10, "title10", "genre10");
    BillboardPoster filmAdd11 = new BillboardPoster(11, "title11", "genre11");


    void setup(PosterManager manager) {
        manager.addFilm(filmAdd1);
        manager.addFilm(filmAdd2);
        manager.addFilm(filmAdd3);
        manager.addFilm(filmAdd4);
        manager.addFilm(filmAdd5);
        manager.addFilm(filmAdd6);
        manager.addFilm(filmAdd7);
        manager.addFilm(filmAdd8);
        manager.addFilm(filmAdd9);


    }

    @Test
    public void shouldAddFilmsEqualManagerLength() {
        PosterManager manager = new PosterManager();

        manager.addFilm(filmAdd10);
        BillboardPoster[] actual = manager.getAllFilms();
        BillboardPoster[] expected = new BillboardPoster[]{filmAdd10};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFilmsShowFromLastToFirst() {
        PosterManager manager = new PosterManager();

        setup(manager);
        BillboardPoster[] actual = manager.getAllFilms();
        BillboardPoster[] expected = new BillboardPoster[]{filmAdd9,filmAdd8,filmAdd7,filmAdd6,filmAdd5,filmAdd4,filmAdd3,filmAdd2,filmAdd1};
        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowFilmsWithLimit() {

        PosterManager manager = new PosterManager(5);
        setup(manager);
        BillboardPoster[] actual = manager.getAllFilms();
        BillboardPoster[] expected = new BillboardPoster[]{filmAdd9, filmAdd8, filmAdd7,
                filmAdd6, filmAdd5};
        assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldDefaultValue() {

        PosterManager manager = new PosterManager();
        setup(manager);
        manager.addFilm(filmAdd10);
        manager.addFilm(filmAdd11);
        BillboardPoster[] actual = manager.getAllFilms();
        BillboardPoster[] expected = new BillboardPoster[]{filmAdd11, filmAdd10, filmAdd9,
                filmAdd8, filmAdd7, filmAdd6, filmAdd5, filmAdd4, filmAdd3, filmAdd2};

        assertArrayEquals(expected, actual);

    }

    @Test
    public void shouldShowFilmsWithZeroNumber() {
        PosterManager manager = new PosterManager(0);
        setup(manager);
        BillboardPoster[] actual = manager.getAllFilms();
        BillboardPoster[] expected = new BillboardPoster[]{};
        assertArrayEquals(expected, actual);


    }

    @Test
    public void shouldShowFilmsWithNegativeNumber() {
        PosterManager manager = new PosterManager(-1);
        setup(manager);
        BillboardPoster[] actual = manager.getAllFilms();
        BillboardPoster[] expected = new BillboardPoster[]{filmAdd9, filmAdd8, filmAdd7,
                filmAdd6, filmAdd5, filmAdd4, filmAdd3, filmAdd2, filmAdd1};
        assertArrayEquals(expected, actual);

    }
}

