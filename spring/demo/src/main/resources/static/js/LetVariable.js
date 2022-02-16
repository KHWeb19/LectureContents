function LetVariable () {
    let num = 77
    var num2 = 77;          // <<<--- 존재해선 안될 존재

    console.log("num = " + num)
    console.log("num2 = " + num2)
    console.log("let 변수는 Hoisting 이라는 괴랄한 문제가 발생하지 않는다.")

    const testNum = 33

    console.log("testNum = " + testNum)
    console.log("자바랑 마찬가지로 const는 선언과 동시에 값 설정이 완료되어야 한다.")

    console.log("자바스크립트에서 var를 쓰면 안된다 절대 쓰면 안된다.")

    //let num = 33
    num = 33
    var num2 = 33;          // <<<--- 존재해선 안될 존재
    console.log("호이스팅: " + num)
    console.log("num2 = " + num2)
}