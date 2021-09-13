



class Song(val title: String, val artist: String) {
    fun play() {
        println("Playing the song $title by $artist")
    }
    fun stop() {
        println("Stopped")
    }
}


fun main(args: Array<String>) {
    val songOne = Song("luoiju", "khikhlk")
    songOne.play()
    println(songOne.artist)
}