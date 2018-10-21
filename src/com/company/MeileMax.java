package com.company;

public class MeileMax {

    //zmienne
    String name;
    String surname;
    int i=0;
//konstruktory
    MeileMax(String name, String surname)
    {
        this.name=name;
        this.surname=surname;


    }
    MeileMax()
    {
        this.name="Brak";
        this.surname="Brak";


    }
    //funkcje do torzenia meilo
    Boolean Sprawdz(String name, String surname)
    {

        if(this.name==name && this.surname==surname)
            return true;
       return false;
    }

    String ZrobMeilpocz(String name, String surname)
    {
        return name+"."+surname;

    }
    String MeilPowtarz(String name, String surname)
    {
        ++i;
        return name+"."+surname+i;
    }
    String MeilCaly(String name, String surname) {

        if(Sprawdz(name,surname)) {

            return MeilPowtarz(name,surname)+"@MAIL.com";
        } return ZrobMeilpocz(name,surname)+"@MAIL.com";
    }

}