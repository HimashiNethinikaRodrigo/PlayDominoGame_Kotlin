package com.nhcompany.domino.model

import java.util.*
import java.util.function.Predicate

class DominoPlayer() {

    var playerDominoList: List<List<Int>> = ArrayList()

    private val score = 0
    private var name: String? = null

    constructor(name: String): this(){
        this.name = name
    }

    /**
     * Return all domino tiles that fulfill the given predicate.
     */
    fun findDominoTiles(predicate: Predicate<Domino<Int?>?>?): List<Domino<Int?>?>? {
        return null
    }

    /**
     * Return the value of the domino with the highest value of the player. The value of a domino tile is the sum of the left
     * and right value.
     */
    fun highestDomino(): Int {
        return -1
    }

    fun getName(): String? {
        return name
    }

    fun getScore(): Int {
        return score
    }


    /**
     * Add all the given dominoes to the players' domino collection.
     */
    fun addDominoes(dominoes: List<Domino<Int?>?>?) {
    }

    /**
     * Add the given domino to the players' domino collection.
     */
    fun addDomino(domino: Domino<Int?>?) {
    }

    /**
     * Remove the given domino from the players' domino collection.
     */
    fun removeDomino(domino: Domino<Int?>?) {
    }
}