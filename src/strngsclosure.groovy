/**
 * Created by akshita on 8/6/16.
 */
String a ="johny"
String b ="blaze"
int c =12

//java syntax to concat
//println "hello" + a + " " +b


//in groovy
println "hello ${a} ${b} $c $a"

List marks = [80, 70, 50, 60, 70]
//to print marks
//in java ==>

/*
println marks[0]
....
for(int i=0; i< mark.size(); i++)
or
{
    println(marks[i])
 }
 */

//in groovy==> use closure { prinltn(it) }

println "in groovy"

marks.each {
    println it
}

marks.each{ i ->
    println (i)
}


//learning closure
int a3=23
Closure v = { a1,a2 ->
    println(a1)
    println(a2)
    println(a3)
}
v.call(12,13)

