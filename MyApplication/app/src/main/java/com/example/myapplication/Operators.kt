package com.example.myapplication

//BODMAS
//fun main(){
//    var result: Int = 5+2*4
//    println("Result = "+result)
//    result (5+2) * 4
//    println("Result = "+result)
//    var x: Int = 8;
//    var y:Int = 4;
//    var z:Int = 2;
//    var sum: Int = 0;
//    Sum = X + --y+ --Z
//    print("x+ --y-z :: $sum")
//}

//fun main(){
//    var myCharRange = 'a'.rangeTo( other: 'j')
//    var testCharRange = 'a' ≤ .. ≤ 'j'
//    var check = 'Z' in testCharRange
//    println("mycharRange has Z = $check")
//    println(myCharRange) println(testCharRange)
//}

fun main(){
 print("Enter name:: ")
 var name: String? = readln();
// The data user inputs is always a String so,
// type conversion for data type other than String
 print("Enter age:: ")
 var age: Int = readln()!!.toInt();
}