function plus (num1, num2) {
    return new Promise(function (resolve, reject) {
        setTimeout(function () {
            res = num1 + num2
            console.log(num1 + " + " + num2 + " = ")
            resolve(res)
        }, 2000)
    })
}

function minus (num1, num2) {
    return new Promise(function (resolve, reject) {
        setTimeout(function () {
            res = num1 - num2
            console.log(num1 + " - " + num2 + " = ")
            resolve(res)
        }, 2000)
    })
}

function divide (num1, num2) {
    return new Promise(function (resolve, reject) {
        setTimeout(function () {
            res = num1 / num2
            console.log(num1 + " / " + num2 + " = ")
            resolve(res)
        }, 2000)
    })
}

function multiply (num1, num2) {
    return new Promise(function (resolve, reject) {
        setTimeout(function () {
            res = num1 * num2
            console.log(num1 + " * " + num2 + " = ")
            resolve(res)
        }, 2000)
    })
}

function PromiseParallelTwo () {
    console.log("JavaScript Promise Parallel Test")

    Promise.all([
        plus(100, 200),
        minus(100, 200),
        multiply(100, 200),
        divide(100, 200)
    ]).then(function (res) {
        console.log(res)
    })

    console.log("자바 스크립트는 스레드 기반(추상화되어 있을뿐)입니다.")
}
