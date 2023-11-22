fun main(){
    val arr = arrayOf(1,2,3)
    try{
        println(arr[5])
    }
    catch(ex: NullPointerException){
        println("pointer is null")
    }
    catch(e: Exception){
        println("please check the array index")
    }
    finally{
        println("I will execute no matter what")
    }

    println("this will not run")

    createUserList(5)
    createUserList(-3)


}
fun createUserList(count: Int){
    if(count<0){
        //raise exception
        throw IllegalArgumentException("count must be greater than 0")
    } else{
        println("user list created containing $count users")
    }
}