/**
 * Created by akshita on 9/6/16.
 */
//operators

List a= [2,3,44,55,2,3,4,5,3,4]
List b=[]
List d=[]
 //in java (array is stored)-> int java int [] b = new int[10]

a.each{ item ->
    if (item > 20) {
        println item
        //to push items into another empty list
        b.push(item)


    }
}


/// to print values of a greater than 20
println a.find{
    return it>20
} //this prints only 1st true condition

// to print all the nos. greater than 20 -->>
println a.findAll {
    return it>20
}


// to print items stored in b
b.each{
    println it
}

//alternative to store in an empty list and then print it
 d = a.findAll {
     it >20
     //same as **return it > 20
 }
 println d