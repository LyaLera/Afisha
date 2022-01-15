package ru.netology;

public class ManagerAfisha {
    private int movieList = 9;

    private Movie[] movies = new Movie[0];

    public ManagerAfisha(int movieList) {
        this.movieList= movieList;
    }

    public ManagerAfisha() {
    }

    public void add (Movie movie) {
        int lenght = movies.length +1;
        Movie[] tmp = new Movie[lenght];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length -1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie[] getLasts(){
        int resultLenght;
        if (movieList < 9) {
            resultLenght = this.movieList + 1;
        } else {
            resultLenght = 10;
        }

        Movie[] result = new Movie[resultLenght];
        for (int i = 0; i < result.length; i++) {
            int index = resultLenght -i -1;
            result[i] = movies[index];
        }
        return result;
    }
}