function PromiseSix () {
    console.log("JavaScript Promise Test")

    const promise = new Promise(function (resolve, reject) {
        setTimeout(function () {
            console.log("가즈아!!!")
            resolve("고고싱!")
        }, 2000)
    })

    promise.then(function (response) {
        console.log("응답: " + response)

        return new Promise(function (resolve, reject) {
            setTimeout(function () {
                console.log("레츠고")
                resolve("간드아!!!!!!!")
            }, 1000)
        })
    }).then(
        (response) => console.log("응답: " + response)
    )

    console.log("작업 완료!")
}
