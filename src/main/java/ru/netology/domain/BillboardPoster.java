package ru.netology.domain;

    public class BillboardPoster {

        private int FilmId;
        private String FilmName;
        private String FilmGenre;

        public BillboardPoster(int filmId, String filmName, String filmGenre) {
            FilmId = filmId;
            FilmName = filmName;
            FilmGenre = filmGenre;
        }

        public int getFilmId() {
            return FilmId;
        }

        public void setFilmId(int filmId) {
            FilmId = filmId;
        }

        public String getFilmName() {
            return FilmName;
        }

        public void setFilmName(String filmName) {
            FilmName = filmName;
        }

        public String getFilmGenre() {
            return FilmGenre;
        }

        public void setFilmGenre(String filmGenre) {
            FilmGenre = filmGenre;
        }
    }




