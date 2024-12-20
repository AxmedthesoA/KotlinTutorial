


//here the Human() and the owner of Human.Pet() has same address so...Pet(0 constructor specially takes
//its parents as argument for sure....
//For more consise evidence I did remove the first element of the list of the Human() object
//that was taken as argument....and after that I found
//owner variable has such value that doesn,t contain the default first elements...
//simply means it was removed somehow....so it is now evident
//that owner variable and the Human() object is same.....

fun main(){
    Human.Pet(Human())
}

class Human(var list: MutableList<Int> = mutableListOf((45),(67),(78))) {
    class Pet {
        constructor(owner:Human){
            owner.list.add(owner.list.size)
            println(owner.list)
            println("This is owner $owner")
        }
    }

    init{
        println("This is outer class $this")
        println("This outer list : ${this.list}")
        this.list.removeFirst()
        println("This outer list : ${this.list}")

    }
}