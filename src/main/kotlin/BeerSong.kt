object BeerSong {
    fun verses(startBottles: Int, takeDown: Int): String {

        return (startBottles downTo takeDown).joinToString("\n") { getVerse(it) }

    }

    private fun getVerse(takeDown: Int): String {

        val verse = when (takeDown) {
            in 2..99 -> "$takeDown bottles of beer on the wall, $takeDown bottles of beer.\n"
            1 -> "1 bottle of beer on the wall, 1 bottle of beer.\n"
            else -> "No more bottles of beer on the wall, no more bottles of beer.\n"
        }

        return verse.plus(when (takeDown) {
            in 3..99 -> "Take one down and pass it around, ${takeDown - 1} bottles of beer on the wall.\n"
            2 -> "Take one down and pass it around, 1 bottle of beer on the wall.\n"
            1 -> "Take it down and pass it around, no more bottles of beer on the wall.\n"
            else -> "Go to the store and buy some more, 99 bottles of beer on the wall.\n"
        })
    }
}
