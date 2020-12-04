package com.nhcompany.domino.model

import java.util.*

class DominoDeck (type: DominoDeckType) {
    private var dominoDeck: MutableList<Domino<Int>> = ArrayList()

    /**
     * This constructor will create all dominoes based on the given type of domino set.
     * Shuffle the created dominoes after creation to put them in a random order.
     */
    init {
        for (i in 0..type.number) {
            for (j in i until type.number) {
                val domino = Domino(i, j)
                (dominoDeck as ArrayList<Domino<Int>>).add(domino)
            }
        }
        dominoDeck.shuffle()
    }

    /**
     * Remove the given number of dominoes from the dominoDeck after shuffle it.
     */
    fun draw(numberOfDominoes: Int): MutableList<Domino<Int>?> {
        dominoDeck.shuffle()
        val dominoList: MutableList<Domino<Int>?> = ArrayList()
        for (i in 0 until numberOfDominoes) {
            dominoList.add(dominoDeck.removeAt(i))
        }
        return dominoList
    }


    /**
     * Remove first domino from the deck after shuffle deck .
     */
    fun draw(): Domino<Int> {
        dominoDeck.shuffle()
        return dominoDeck.removeAt(0)
    }

    /**
     * Check whether domino deck is empty.
     */
    fun isEmpty(): Boolean {
        return dominoDeck.isEmpty()
    }
}