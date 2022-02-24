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
    const res1 = await plus(100, 200)
    console.log(res1)
    const res2 = await minus(100, 200)
    console.log(res2)
    const res3 = await multiply(100, 200)
    console.log(res3)
    const res4 = await divide(100, 200)
    console.log(res4)
}

function PromiseParallelFour () {
    console.log("JavaScript Promise Parallel Test")

    asyncProcess()

    console.log("자바 스크립트는 스레드 기반(추상화되어 있을뿐)입니다.")
}
