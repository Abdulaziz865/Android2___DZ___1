package com.example.android2___dz___1.repository

import com.example.android2___dz___1.model.RecyclerModel

class RecyclerRepository {

    private val listOfCharacters: ArrayList<RecyclerModel> = ArrayList()

    fun getListOfCharacters(): ArrayList<RecyclerModel> {
        listOfCharacters.add(RecyclerModel("Cristiano Ronaldo"))
        listOfCharacters.add(RecyclerModel("Lionel Messi"))
        listOfCharacters.add(RecyclerModel("Pele"))
        listOfCharacters.add(RecyclerModel("Ronaldo"))
        listOfCharacters.add(RecyclerModel("Maradona"))
        listOfCharacters.add(RecyclerModel("Crueff"))
        listOfCharacters.add(RecyclerModel("Zidane"))
        listOfCharacters.add(RecyclerModel("Ronaldinho"))
        listOfCharacters.add(RecyclerModel("Platini"))
        listOfCharacters.add(RecyclerModel("Di Stefano"))
        listOfCharacters.add(RecyclerModel("Van Busten"))
        listOfCharacters.add(RecyclerModel("Keegan"))
        listOfCharacters.add(RecyclerModel("Beckham"))
        listOfCharacters.add(RecyclerModel("Bekkenbauer"))
        listOfCharacters.add(RecyclerModel("Neymar Jr."))
        listOfCharacters.add(RecyclerModel("Benzema"))
        listOfCharacters.add(RecyclerModel("Lewandowski"))
        listOfCharacters.add(RecyclerModel("Zlatan"))
        listOfCharacters.add(RecyclerModel("Lew Yashin"))
        return listOfCharacters
    }
}