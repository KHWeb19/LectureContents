function PromiseFour () {
    console.log("JavaScript Promise Test")

    const promise = new Promise(function (resolve, reject) {
        setTimeout(function () {
            console.log("가즈아!!!")
            reject("거부! 쀍!")
        }, 2000)
    })

    /*
    promise.then(function (response) {
        console.log("응답: " + response)
    }).catch(function (error) {
        console.log("에러: " + error)
    }).finally(() => {
        console.log("옆에서 칼부림을 하던 폭탄이 터지던 난 내 길을 간다.")
    })
    */
    promise.then(
        (response) => console.log("응답: " + response)
    ).catch(
        (error) => console.log("에러: " + error)
    ).finally(
        () => console.log("옆에서 칼부림을 하던 폭탄이 터지던 난 내 길을 간다.")
    )

    console.log("작업 완료!")
}
