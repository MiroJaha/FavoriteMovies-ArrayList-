fun main(){
    val Movies= arrayListOf<String>()

    println("Please Enter Your Favorite Movies")
    println("    hint: you should enter at least 3 movies")

    var count =1
    while(true){
        print("Please Enter Your Favorite Movie Number $count: ")
        Movies.add(readLine().toString())
        count++
        if(count>3){
            print("Type (yes) to Enter New Favorite Movie or (no) to Exit ")
            if(readLine().toString()=="no")
                break
        }
    }
    println("Your Favorite Movies are:")
    for(i in Movies)
        println(i)
}