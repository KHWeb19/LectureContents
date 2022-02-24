function PromiseOne () {
    console.log("JavaScript Promise Test")

    const promise = new Promise (function (resolve, reject) {
        setTimeout(function () {
            console.log("주어진 시간 만료!")
            resolve();
        }, 2000)
    })

    promise.then(function () {
        console.log("아웃!")
    })

    console.log("자바 스크립트는 스레드 기반(추상화되어 있을뿐)입니다.")
}
