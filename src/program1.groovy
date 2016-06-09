/**
 * Created by akshita on 8/6/16.
 */

println "hello world "

List a = [ 1,2,3,4,5]
List a1 = ["ankur", "singh", 2, 3.4 ,true]
if(a) {
    println "the a is not empty"
}

String b= ""
 if (b) {
     println "b is not empty"
 }
else {
     println " b is empty"
 }

String ba = '''
    dabdiad
    sfsfsf
    ssfsfdf
    fssdsd

    sdsvf   fdbfbgf
'''
println "$ba"

String key = "firstName"
Map data = [ "firstName": "shubham", lastname: "jain", info: "i came late today"]
println data
println(data.firstName)
println(data.get("firstName"))
println(data["lastname"])

println data[key]
println data.key
println data.get("key")
println key

