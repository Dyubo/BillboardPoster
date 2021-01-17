package ru.netology.manager;

    import ru.netology.domain.BillboardPoster;

    public class PosterManager {
        BillboardPoster[] posters = {
                new BillboardPoster(1,"filmTitle1", "filmGenre1"),
                new BillboardPoster(2,"filmTitle2", "filmGenre2"),
                new BillboardPoster(3,"filmTitle3", "filmGenre3"),
                new BillboardPoster(4,"filmTitle4", "filmGenre4"),
                new BillboardPoster(5,"filmTitle5", "filmGenre5"),
                new BillboardPoster(6,"filmTitle6", "filmGenre6"),
                new BillboardPoster(7,"filmTitle7", "filmGenre7"),
                new BillboardPoster(8,"filmTitle8", "filmGenre8"),
                new BillboardPoster(9,"filmTitle9", "filmGenre9"),

        };
        public void add(BillboardPoster poster){
            int length = posters.length +1;
            BillboardPoster[] tmp = new BillboardPoster[length];
            for (int i = 0; i < posters.length; i++){
                tmp[i] = posters[i];
            }
            int lastIndex = tmp.length -1;
            tmp [lastIndex] = poster;
            posters = tmp;

        }
        public BillboardPoster[] getAll(int numberFilm) {
            int defaultNumber = 1;
            if (numberFilm < 0) {
                numberFilm = defaultNumber;
            }
            if (defaultNumber > posters.length)
                defaultNumber = posters.length;
            if (numberFilm < defaultNumber) {
                defaultNumber = numberFilm;
            } else {
                defaultNumber = posters.length;
            }
            BillboardPoster[] result = new BillboardPoster[defaultNumber];
            for (int i = 0; i < posters.length; i++) {
                int index = posters.length - i - 1;
                result[i] = posters[index];
            }
            return result;
        }



    }


