package model;

import java.util.ArrayList;

public class Film {
    private String filmName;
    private int year;
    private double imdbScore;
    private ArrayList<Category> categoryList = new ArrayList<>();
    private ArrayList<Platform> platformList = new ArrayList<>();

    public Film(String filmName, int year, double imdbScore) {
        this.filmName = filmName;
        this.year = year;
        this.imdbScore = imdbScore;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getImdbScore() {
        return imdbScore;
    }

    public void setImdbScore(double imdbScore) {
        this.imdbScore = imdbScore;
    }

    public ArrayList<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(ArrayList<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public ArrayList<Platform> getPlatformList() {
        return platformList;
    }

    public void setPlatformList(ArrayList<Platform> platformList) {
        this.platformList = platformList;
    }

    @Override
    public String toString() {
        return "Film{" +
                "filmName='" + filmName + '\'' +
                ", year=" + year +
                ", imdbScore=" + imdbScore +
                ", categoryList=" + categoryList +
                ", platformList=" + platformList +
                '}';
    }
}
