package com.example.rock_paper_scissor


    fun main(){
        var userChoice=""
        var computeChoice=""
        println("Choose From Any One :\n 1.Rock \n 2. Paper \n 3.Scissor")
        userChoice=readln()

        val randomNumber=(1..3).random()
          when(randomNumber){
                1-> computeChoice="Rock"
                2-> computeChoice="Paper"
                3-> computeChoice="Scissor"
        }

        println("Computer Choice is: $computeChoice")

        val winner=when{
            userChoice==computeChoice->"Tie"
            userChoice=="Rock"&&computeChoice=="Scissor"->"User"
            userChoice=="Paper"&&computeChoice=="Rock"->"User"
            userChoice=="Scissor"&&computeChoice=="Paper"->"User"
            else ->"Computer"
        }
if(winner=="Tie"){
    println("It's a Tie")
}
        else {
    println("Wow ! Winner is : $winner")
}
    }
