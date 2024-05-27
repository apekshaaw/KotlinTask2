package com.example.myapplication

//fun main() {
//    print("Please enter your age :: ")
//    var yourAge: Int = readln()!!.toInt()
//    if (yourAge < 13) {
//        print("You are a child")
//    } else if (yourAge < 19) {
//        print("You are a teenager")
//    } else {
//        if (yourAge < 50) {
//            print("You are an adult")
//        } else {
//            print("You are a senior")
//        }
//    }
//}

//fun main(){
//    println("Please enter 3 numbers: ")
//    var number1: Int = readln()!!.toInt()
//    var number2: Int = readln()!!.toInt()
//    var number3: Int = readln()!!.toInt()
//    var largestNumber: Int
//    if (number1 >= number2) {
//        if (number1 >= number3) {
//            largestNumber = number1
//        } else {
//            largestNumber = number3
//        }
//    } else {
//        if (number2 >= number3) {
//            largestNumber = number2
//        } else {
//            largestNumber = number3
//        }
//    }
//    println("The largest number is $largestNumber")
//}

//fun main(){
//    print("Please enter a day number of week: - ")
//    var dayNumber: Int = readln()!!.toInt()
//    var day: String
//    when (dayNumber)
//    {
//        1 -> day = "Sunday"
//        2 -> day = "Monday"
//        3 -> day = "Tuesday"
//        4 -> day = "Wednesday"
//        5-> day = "Thursday"
//        6 -> day = "Friday"
//        7 -> day = "Saturday"
//        else -> day = "Invalid day choice"
//    }
//    println(day)
//}

//fun main(){
//    var number = Random.nextInt(from: 0 , until: 10000)
//    println("Please enter any number from 0 to 10000: -")
//        while (2>1){
//            var userGuess: Int = readln()!!.toInt()
//            if (userGuess == number) {
//                println("congratulations!!!!, you won")
//                break
//            }else if(userGuess<number) {
//                println("Increase your guess")
//            }else{
//                println("Decrease your guess")
//            }
//            ")
//        }
//}

fun main(){
    var number = 1
    do {
        println(number)
        number++
    }while(number <= 15)
}