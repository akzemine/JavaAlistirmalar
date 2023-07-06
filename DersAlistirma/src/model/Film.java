package model;

public class Film {

    private String filmName;
    private int year;
    private String director;
    private double imdb;
    private String category;
    private String time;
    private String platform;

    public Film(String filmName, int year, String director) {
        FilmName = filmName;
        this.year = year;
        this.director = director;
    }

    public String getFilmName(){
        return filmName;
    }

    public void setFilmName(String filmName){
        if (filmName.contains("xxx")){
            this.filmName = "AAA";
        }
        else{
            this.filmName = filmName;
        }
    }

    public int getYear(){
        return year;
    }



}
