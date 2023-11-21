fun main(){
    print("Enter your Age: ")
    val userInput: String? = readlnOrNull()
    val age: Int? = userInput?.toInt()
    if (age != null) {
        if (age > 18){
            print("you can vote\n")
        } else{
            print("you cant vote till you're 18\n")
        }
    }

    val value: Int = if(age!! >35){
        1
    }else{
        0
    }

    if(value == 1){
        println("and you can also contest for president")
    }else{
        println("but you cannot contest for president")
    }

    val x = 6
    val y = 9
    val result = if (x>y) x else y
    println("The greatest Number is: $result")
}