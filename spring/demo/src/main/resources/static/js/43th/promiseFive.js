function PromiseFive () {
    console.log("JavaScript Promise Test")

    const promise = new Promise(function (resolve, reject) {
        setTimeout(function () {
            console.log("가즈아!!!")
            resolve("우디를 ?")
        }, 2000)
    })

    promise.then(
        (response) => console.log("응답: " + response)
    ).then(
        (response) => console.log("응답: " + response)
    )

    console.log("작업 완료!")
}
