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

    var floatNum1 = 33.0
    var intNum = 33
    var floatNum2 = 37.1
    var floatNum3 = 33.00

    var expNum1 = 123e5
    var expNum2 = 123e-5

    var num1 = 3, num2 = 3, num3 = 7
    var boolRes1 = (num1 === num2)
    var boolRes2 = (num1 === num3)

    var cars = ["BMW", "Volvo", "Audi", "Porsche"]

    console.log("length: " + length)
    console.log("lastName: " + lastName)
    console.log("x: " + x.toString())

    console.log("test1: " + test1)
    console.log("test2: " + test2)
    console.log("numTest: " + numTest)

    console.log("strTest1: " + strTest1)
    console.log("strTest2: " + strTest2)
    console.log("strTest3: " + strTest3)

    console.log('floatNum1: ' + floatNum1)
    console.log('floatNum2: ' + floatNum2)
    console.log('floatNum3: ' + floatNum3)
    console.log('intNum: ' + intNum)

    console.log('expNum1: ' + expNum1)
    console.log('expNum2: ' + expNum2)

    console.log('boolRes1: ' + boolRes1)
    console.log('boolRes2: ' + boolRes2)

    for (var i = 0; i < 4; i++) {
        console.log("cars[" + i + "] = " + cars[i])
    }

    // var는 약타입이라 아무거나 다 될 수 있음
    // 실제 구동될때 강타입으로 특정한 형태를 가지게 됨
    // 위에서 봤듯이 의도와는 다른 형태가 나타날때가 있음
    // 이런 케이스에서 문제가 발생할 수 있는 부분들이 있어 TypeScript 같은것이 나타나게 됨
    // 우선은 너무 깊게 팔 필요 없고 이정도 알면 됨
    console.log("typeof(test1): " + typeof(test1))
    console.log("typeof(floatNum1): " + typeof(floatNum1))
    console.log("typeof(intNum): " + typeof(intNum))
    console.log("typeof(floatNum2): " + typeof(floatNum2))
    console.log("typeof(boolRes1): " + typeof(boolRes1))
    console.log("typeof(cars): " + typeof(cars))
}