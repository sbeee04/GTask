package com.ra.busBooking.controller;

import com.ra.busBooking.DTO.BookingsDTO;
import com.ra.busBooking.DTO.UserRegisteredDTO;
import com.ra.busBooking.helper.ObjectCreationHelper;
import com.ra.busBooking.model.Bookings;
import com.ra.busBooking.model.User;
import com.ra.busBooking.repository.BookingsRepository;
import com.ra.busBooking.repository.UserRepository;
import com.ra.busBooking.service.DefaultUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/myProfile")
public class ProfileController {

    private DefaultUserService userService;

    public ProfileController(DefaultUserService userService) {
        super();
        this.userService = userService;
    }

    @Autowired
    UserRepository userRepository;

    @GetMapping
    public String login(Model model) {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        UserDetails users = (UserDetails) securityContext.getAuthentication().getPrincipal();
        User user =userRepository.findByEmail(users.getUsername());


        List<UserRegisteredDTO> uks = new ArrayList<>();
        List<User> us = (List<User>) userRepository.findByEmail(user.getEmail());

        for (User u : us) {
            UserRegisteredDTO ukks = ObjectCreationHelper.create(u);
            uks.add(ukks);
        }
        model.addAttribute("userDetails", user.getName());
        Collections.reverse(uks);
        model.addAttribute("user",uks);
        return "profile";
    }

}

