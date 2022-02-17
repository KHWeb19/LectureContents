function SpreadTest () {
    let arrColor = ["red", "green", "blue"]
    let newArrColor = [...arrColor, "purple"]
    
    console.log("arrColor: " + arrColor)
    console.log("newArrColor: " + newArrColor)

    let arrNum = [2, 3, 4]
    let newArrNum = [1, ...arrNum, 5]

    console.log("arrNum: " + arrNum)
    console.log("newArrNum: " + newArrNum)

    function arrPrint (a, b, c) {
        console.log(a)
        console.log(b)
        console.log(c)
    }

    let arr = [1, 2, 3]

    console.log(arr)
    arrPrint(...arr)

    function arrSpreadingPrint (a, b, c, ...remain) {
        console.log(a)
        console.log(b)
        console.log(c)
        console.log(remain)
    }

    let arrSpread = [1, 2, 3, 4, 5, 6, 7, 8, 9]

    console.log(arrSpread)
    arrPrint(...arrSpread)
    arrSpreadingPrint(...arrSpread)
}