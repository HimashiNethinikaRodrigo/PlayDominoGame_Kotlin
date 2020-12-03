package com.nhcompany.domino.model

class Domino<T> (){
    constructor(left: T, right: T) : this() {
        this.left = left
        this.right = right
    }

    private var left: T
        get() = left

        set(value){
            value.also { left = it }
        }

    private var right: T
        get() = right

        set(value){
            value.also { this.right = it }
        }


    /**
     * Flip the left and right side of the domino tile.
     */
    fun flip() {
        left += right
        right = left - right
        left -= right
    }

    /**
     * Check if the left and the right value are the same.
     */
    fun isDouble(): Boolean {
        return left == right
    }


    /**
     * Check if the given domino tile other can be placed left from this domino.
     */
    fun matchLeft(other: Domino<T>): Boolean {
        return left == other.right || left == other.left
    }

    /**
     * Check if the given domino tile other can be placed right from this domino.
     * It can be necessary to flip the given tile to make it match.
     */
    fun matchRight(other: Domino<T>): Boolean {
        return right == other.right || right == other.left
    }

    /**
     * Check if this domino tile contains the given value.
     */
    operator fun contains(value: T): Boolean {
        return right == value || left == value
    }


    /**
     * For domino tiles with integer values 7 and 8 this would be "|7|8|" for domino
     */
    override fun toString(): String {
        return "|$left|$right|"
    }


}

private operator fun <T> T.minus(right: T): T {
    return right
}

private operator fun <T> T.plusAssign(right: T) {
    
}

