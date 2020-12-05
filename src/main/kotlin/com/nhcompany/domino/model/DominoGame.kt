package com.nhcompany.domino.model

import java.util.*

private val MAX_SCORE = 100

fun main(args: Array<String>) {
    println("+++++ DOMINO ++++++++")
    println("Number of players: ")
    val sc = Scanner(System.`in`)
    val numberOfPlayers = sc.nextInt()
    val playerList: MutableList<String> = ArrayList()
    for (i in 1..numberOfPlayers) {
        println("Player $i’s name:")
        playerList.add(sc.next())
    }
    val dominoSet = DominoDeck(DominoDeckType.DECK_SIX)
    for (playerName in playerList) {
        println("$playerName’s turn:")
        val dominos: MutableList<Domino<Int>?> = dominoSet.draw(7)
        for (i in dominos.indices) {
            val number = i+1
            val dominoValue = dominos[i].toString()
            println("$number => $dominoValue)")
        }
        println("Choose a domino:")

    }

}