package com.nhcompany.domino.model

import java.util.*

class DominoBoneYard {
    private val DOMINO_PICTURES_COLS = 5

    var dominoTable: LinkedList<Domino<Int>> = LinkedList<Domino<Int>>()

    /**
     * Add the given domino tile to the left end of the domino tiles already played.
     */
    fun addLeft(domino: Domino<Int>) {
        dominoTable.addFirst(domino)
    }

    /**
     * Add the first domino tile to an empty game board.
     */
    fun add(domino: Domino<Int>) {
        dominoTable.add(domino)
    }

    /**
     * Add the given domino tile to the right end of the domino tiles already played.
     */
    fun addRight(domino: Domino<Int>) {
        dominoTable.addLast(domino)
    }

    /**
     * @return true if the game board is empty, false otherwise.
     */
    fun isEmpty(): Boolean {
        return dominoTable.isEmpty()
    }

    /**
     * @return the left most domino tile on the gameboard.
     */
    fun getLeft(): Domino<Int>? {
        return dominoTable.first
    }

    /**
     * @return the right most domino tile on the game board.
     */
    fun getRight(): Domino<Int>? {
        return dominoTable.last
    }

    /**
     * A textual representation of the tiles on the game board.
     */
    override fun toString(): String {
        return ""
    }

    /**
     * @return he number of tiles layed down on this gameboard.
     */
    fun getSize(): Int {
        return dominoTable.size
    }

}