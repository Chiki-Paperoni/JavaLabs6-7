package com.company.controller;


//ABSTRACT FACTORY
public interface AbstractController {
    public void menu() ;
    int getOption() ;
    public int executeOption(int option) ;
}
