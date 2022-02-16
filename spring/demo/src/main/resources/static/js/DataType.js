function DataType () {
    var length = 7
    var lastName = "Gogosing"
    var x = { firstName: "Rust", lastName: "Golang" }

    var test1 = 7 + "Test"
    var test2 = "7" + "test"
    var numTest = 3 + 7 + "Test"

    var strTest1 = "It's OK"
    var strTest2 = '요런것도 "되네" 정말 ?!'
    var strTest3 = "이런것도 '되네' !!!"

    console.log("length: " + length)
    console.log("lastName: " + lastName)
    console.log("x: " + x.toString())

    console.log("test1: " + test1)
    console.log("test2: " + test2)
    console.log("numTest: " + numTest)

    console.log("strTest1: " + strTest1)
    console.log("strTest2: " + strTest2)
    console.log("strTest3: " + strTest3)
}