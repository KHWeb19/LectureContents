function ArrowAPITest () {
    console.log("JavaScript Arrow Function Test")

    const f = function () { return "33" }

    const arrowFunc = () => { return "77" }

    console.log("f: " + f())
    console.log("arrowFunc: " + arrowFunc())

    const add100 = function (val) { return 100 + val }

    console.log("add100(3): " + add100(3))

    const arrow100 = (val) => { return 100 + val }

    console.log("arrow100(3): " + arrow100(3))

    const addTwoParam = function (a, b) { return a + b }

    console.log("addTwoParam(3, 7): " + addTwoParam(3, 7))

    const arrowTwoParam = (a, b) => { return a + b }

    console.log("arrowTwoParam(3, 7): " + arrowTwoParam(3, 7))

    const calc = {
        // 클래스 멤버 변수 만드는 작업 같은것이라고 생각하면됨
        first: 33,
        second: 777,

        // 현재 케이스처럼 this.first는 calc의 내부 정보가되는데
        // 케이스 바이 케이스 형태로 다뤄 보는 것이 가장 좋다.
        print: function () {
            console.log(this)

            const add = () => {

                return this.first + this.second
            }

            console.log(this.first + " + " + this.second + " = " + add())
        }
    }

    calc.print()

    const add = (first, second, ... args) => {
        console.log(first, second, args)

        let sum = first + second

        for (let i = 0; i < args.length; i++) {
            sum += args[i]
        }

        return sum
    }

    let sum = add(1, 2, 3, 4, 5)

    console.log("sum = " + sum)
}
