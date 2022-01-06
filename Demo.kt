package edu.uw.abdiwahid.helloandroid

import java.nio.charset.CharacterCodingException

//This is a comment
fun main(args: Array<String>){
    println("Hello World");
    10.toString() // Integer.toString(10)

    val age = 50;
    var otherAge = 40.0f;

    // age = 51 <-- would not work
    otherAge = 49.0f;


    var name = "String";

   // name = null;// would not work cant assign a string null


    // var name: String? = "Ted" // to be able to assign string to null values

    otherAge = (49.0f).toFloat()


    val s = "Hello World";

    val s2 = "s = ${s}!"


    val text = """
        for(c in "foo")
        print(c)
    """


    val nums = arrayOf(1,2,3);


    println(nums[2]);


    val nulls: Array<Any?> = arrayOfNulls(3);


    val asc = Array(5, {i -> (i * i).toString()})


}
// everything is an object


// val denotes immaytable



val s = mutableListOf<Int>(10,30,30)

var map = mutableMapOf<String, Int>("Abdiwahid" to 1);
