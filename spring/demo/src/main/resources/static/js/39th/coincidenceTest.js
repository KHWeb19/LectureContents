function CoincidenceTest () {
    let name = "test"

    if (name) {
        console.log("true")
    } else {
        console.log("false")
    }

    if (name === "test") {
        console.log("equal")
    } else {
        console.log("not equal")
    }

    if (name === "go") {
        console.log("equal")
    } else {
        console.log("not equal")
    }

    if (name === true) {
        console.log("equal")
    } else {
        console.log("not equal")
    }

    if (name === null) {
        console.log("equal")
    } else {
        console.log("not equal")
    }

    if (name === undefined) {
        console.log("equal")
    } else {
        console.log("not equal")
    }

    console.log("특이점 발생!")

    let a = 1;
    let b = "1";

    console.log(a == b)     // 1이라는 것 자체에 집중함
    console.log(a === b)    // 저놈은 Integer 나는 String

    console.log(null == undefined)
    console.log(null === undefined)

    console.log(true == 1)
    console.log(true === 1)
}