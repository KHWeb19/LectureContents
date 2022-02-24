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
        }, 1500)
    })
}

function divide (num1, num2) {
    return new Promise(function (resolve, reject) {
        setTimeout(function () {
            res = num1 / num2
            console.log(num1 + " / " + num2 + " = ")
            resolve(res)
        }, 1000)
    })
}

function multiply (num1, num2) {
    return new Promise(function (resolve, reject) {
        setTimeout(function () {
            res = num1 * num2
            console.log(num1 + " * " + num2 + " = ")
            resolve(res)
        }, 500)
    })
}

async function asyncProcess () {
    const p1 = plus(100, 200)
    const p2 = minus(100, 200)
    const p3 = multiply(100, 200)
    const p4 = divide(100, 200)

    const res1 = await p1
    const res2 = await p2
    const res3 = await p3
    const res4 = await p4

    console.log(res1)
    console.log(res2)
    console.log(res3)
    console.log(res4)
}

function PromiseParallelFive () {
    console.log("JavaScript Promise Parallel Test")

    asyncProcess()

    console.log("자바 스크립트는 스레드 기반(추상화되어 있을뿐)입니다.")
}
