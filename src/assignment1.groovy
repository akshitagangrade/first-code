/**
 * Created by akshita on 8/6/16.
 */
class User{
    String firstName
    String lastName
    String email
    int age

    /* to use with it
        String toString() {
        return "${firstName} ${lastNAme} ($age)"
        }
     */
}
Map m1 = [firstName: "AKshita", lastName: "Gangrade", email: "dus@gmail.com" , age:21]
Map m2= [firstName: "smita", lastName: "p", email: "csdbsds" , age:10]
Map m3 = [firstName: "sagar", lastName: "jain", email: "csdbsds" , age:53]
Map m4 = [firstName: "priyal", lastName: "sds", email: "csdbsds" , age:20]
Map m5 = [firstName: "sagar", lastName: "jain", email: "csdbsds" , age:21]

User u1 = new User(m1)
User u2 = new User(m2)
User u3 = new User(m3)
User u4 = new User(m4)
User u5 = new User(m5)

List a=[u1, u2, u3, u4, u5]

a.each {
    println "${it.firstName} ${it.lastName} (${it.age})"
}

/*
    a.each
    {
    println it
 */


/*to check the age of 5 users and store age into array whose age s less than 20
and store age into another aray whose age is greater than 20 */

List b = []
List d = []

a.each {item ->
    if (item.age > 20) {
       // println "${item.age}"
        b.push (item)
        }
    if ( item.age < 20){
        d.push(item)
    }
} println("hen age is regater than 20")
b.each {
    println "${it.firstName} ${it.lastName} (${it.age})"
} println "age is greater thn 20"
d.each {
    println "${it.firstName} ${it.lastName} (${it.age})"
}


