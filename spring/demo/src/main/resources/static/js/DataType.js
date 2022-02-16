function DataType () {
    var length = 7
    var lastName = "Gogosing"
    var x = { firstName: "Rust", lastName: "Golang" }

    var test1 = 7 + "Test"
    var test2 = "7" + "test"
    var numTest = 3 + 7 + "Test"

    console.log("length: " + length)
    console.log("lastName: " + lastName)
    console.log("x: " + x.toString())

    console.log("test1: " + test1)
    console.log("test2: " + test2)
    console.log("numTest: " + numTest)
}