/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author andre.ayamamoto
 */
@Controller
@RequestMapping("/pessoa")
public class controllerUm {

    @GetMapping
    public ModelAndView home() {
        //Homepage do /pessoa
        return new ModelAndView("pessoa-cadastro");
    }
}
