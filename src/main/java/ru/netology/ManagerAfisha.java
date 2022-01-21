package ru.netology;

public class ManagerAfisha {
    private int movieLimit = 9;
    private Movie[] movies = new Movie[0];

    public ManagerAfisha(int movieLimit) {
        this.movieLimit = movieLimit;
    }

    public ManagerAfisha() {
    }

    public void add(Movie movie) {
        int length = movies.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(movies, 0, tmp, 0, movies.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = movie;
        movies = tmp;
    }

    public Movie[] getLasts() {
        int resultLength;
        if (movieLimit < movies.length - 1) {
            resultLength = this.movieLimit + 1;
        } else {
            resultLength = movies.length;
        }
        Movie[] result = new Movie[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = resultLength - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}