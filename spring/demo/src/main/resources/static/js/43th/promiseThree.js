function PromiseThree () {
    console.log("JavaScript Promise Test")

    const promise = new Promise(function (resolve, reject) {
        setTimeout(function () {
            console.log("가즈아!!!")
            reject("거부! 쀍!")
        }, 2000)
    })

    promise.then(function (response) {
        console.log("응답: " + response)
    }).catch(function (error) {
        console.log("에러: " + error)
    })

    console.log("작업 완료!")
}
