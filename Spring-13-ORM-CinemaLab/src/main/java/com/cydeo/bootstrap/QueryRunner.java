package com.cydeo.bootstrap;

import com.cydeo.enums.Role;
import com.cydeo.repository.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class QueryRunner implements CommandLineRunner {
    private final AccountRepository accountRepository;
    private final CinemaRepository cinemaRepository;
    private final MovieRepository movieRepository;
    private final MovieCinemaRepository movieCinemaRepository;
    private final TicketRepository ticketRepository;

    public QueryRunner(AccountRepository accountRepository, CinemaRepository cinemaRepository, MovieRepository movieRepository, MovieCinemaRepository movieCinemaRepository, TicketRepository ticketRepository) {
        this.accountRepository = accountRepository;
        this.cinemaRepository = cinemaRepository;
        this.movieRepository = movieRepository;
        this.movieCinemaRepository = movieCinemaRepository;
        this.ticketRepository = ticketRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("===============Account================");
        System.out.println("findAllByCountryOrState: " +  accountRepository.findAllByCountryOrState("United State", "New York"));
        System.out.println("++++++++++");
        System.out.println("findAllByAgeLessThanEqual: " + accountRepository.findAllByAgeLessThanEqual(56));
        System.out.println("++++++++++");
        System.out.println("findAllByRole: " + accountRepository.findAllByRole(Role.USER));
        System.out.println("++++++++++");
        System.out.println("findByAgeBetween: " + accountRepository.findByAgeBetween(28,90));
        System.out.println("++++++++++");
        System.out.println("findByAddressStartingWith: " + accountRepository.findByAddressStartingWith("ate"));
        System.out.println("++++++++++");
        System.out.println("findByOrderByAge: " + accountRepository.findByOrderByAgeDesc());
        System.out.println("--------------------------------------");

//        System.out.println(accountRepository.fetchAdminUsers());
//        System.out.println(cinemaRepository.distinctBySponsoredName());
//        System.out.println(movieRepository.fetchAllMovieNames());
//        System.out.println(movieCinemaRepository.countAllByCinemaId(4L));
//        System.out.println(movieCinemaRepository.retrieveAllByLocationName("AMC Empire 25"));
//        System.out.println(ticketRepository.fetchAllTicketsByUserAccount(4L));
//        System.out.println(ticketRepository.fetchAllTicketsWithRangeOfDates(LocalDateTime.now().minusDays(25), LocalDateTime.now()));
//        System.out.println(ticketRepository.retrieveAllBySearchCriteria("it"));

    }
}
