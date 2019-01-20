package com.feea.moviereview.controller;

import com.feea.moviereview.entity.Movie;
import com.feea.moviereview.entity.Review;
import com.feea.moviereview.repository.MovieRepository;
import com.feea.moviereview.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    MovieRepository movieRepository;

    @Autowired
    ReviewRepository reviewRepository;

    @GetMapping("/all")
    public String listAllMovies(Model model){
        List<Movie> allMovies = movieRepository.findAll();
        model.addAttribute("allMovies",allMovies);
        return "movies";
    }

    @GetMapping("/reviews")
    public String getReviewsForMovie(@PathVariable("movieId")String movieId, Model model){
        List<Review> reviews = reviewRepository.findAllByMovieId(Integer.parseInt(movieId));
        model.addAttribute("reviews",reviews);
        return "movies";
    }
}
