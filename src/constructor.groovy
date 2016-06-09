/**
 * Created by akshita on 8/6/16.
 */
class Person {
    String firstName
    String lastName
    String a
    String b
    float c
    int score


}

Map m = [firstName: "hello", lastName: "bye", score: 3, a: 2,b: 3, c: 2.3]

Person u = new Person(m)
println u.firstName
println u.lastName
println u.a
println u.b
println u.c
println u.score

