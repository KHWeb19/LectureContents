function RepeatArrayApiTest () {
    console.log("JavaScript Repeat Array test")

    let arr = [1, 3, 8, 10, 7, 11, 19, 77, 33]
    let txt = ""

    arr.forEach(testFunc)

    function testFunc (value) {
        txt = txt + value + "<br>"
    }

    console.log(txt)

    let sequence = [1, 2, 3, 4, 5]
    let squareSeq = sequence.map(squareFunc)

    function squareFunc (value) {
        return value * value
    }

    console.log("sequence: " + sequence)
    console.log("squareSeq: " + squareSeq)

    let over3 = sequence.filter(filterFunc)

    function filterFunc (value) {
        return value > 3
    }

    console.log("3 보다 큰 것: " + over3)
}