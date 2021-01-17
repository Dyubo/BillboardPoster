package ru.netology.domain;

    public class BillboardPoster {

        private int MovieId;
        private String FilmName;
        private String FilmGenre;


        public int getMovieId() {
            return MovieId;
        }

        public void setMovieId(int movieId) {
            MovieId = movieId;
        }

        public String getFilmId() {
            return FilmName;
        }

        public void setFilmId(String filmId) {
            FilmName = filmId;
        }

        public String getFilmGenre() {
            return FilmGenre;
        }

        public void setFilmGenre(String filmGenre) {
            FilmGenre = filmGenre;
        }

        public BillboardPoster(int movieId, String filmName, String filmGenre) {
            MovieId = movieId;
            FilmName = filmName;
            FilmGenre = filmGenre;
        }
    }


