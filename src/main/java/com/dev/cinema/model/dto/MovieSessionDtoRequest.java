package com.dev.cinema.model.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

public class MovieSessionDtoRequest {
    @Positive
    private Long movieId;
    @Positive
    private Long cinemaHallId;
    @NotNull
    private String showTime;

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Long getCinemaHallId() {
        return cinemaHallId;
    }

    public void setCinemaHallId(Long cinemaHallId) {
        this.cinemaHallId = cinemaHallId;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }
}
