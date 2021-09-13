


class Dog(val name: String, weight_param: Int, breed_param: String) {
    init {
        print("ok")
    }
    val activities = arrayOf("Walks")
    val breed = breed_param.uppercase()
    init {
        println("OKOK")
    }
    var weight = weight_param
        set(value) {
            if (value > 0) field = value
        }
    val wieghtInKgs: Double
        get() = weight / 2.2
    fun bark() {
        println(if (weight < 20) "yip" else "woof")
    }
}

fun main(args: Array<String>) {
    val myDog = Dog("Fido", 70, "Mixes")
    myDog.bark()
    myDog.weight = 75
    println(myDog.wieghtInKgs)
    myDog.weight -= 2
    println(myDog.wieghtInKgs)

}