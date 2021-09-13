import kotlin.random.Random



fun do_choice(list_of_choices: Array<String>): String {
    return list_of_choices.random()
}

fun ask_choice(choices: Array<String>): String {
    val choose: String = readLine().toString()
    if (choose in choices) {
        return choose
    }
    else {
        return ask_choice(choices)
    }
}


fun get_end(pc_choice: String, user_choice: String): String {
    if (pc_choice == user_choice) {
        return "Tie"
    }
    if ((pc_choice == "scissors" && user_choice == "paper") || (pc_choice == "stone" && user_choice == "scissors")) {
        return "You lose"
    }
    else return "ok"
}


fun main(args: Array<String>) {
    val choices = arrayOf("scissors", "stone", "paper")
    var choose = do_choice(choices)
    var user =  ask_choice(choices)
    var end = get_end(choose, user)
    println(end)

}