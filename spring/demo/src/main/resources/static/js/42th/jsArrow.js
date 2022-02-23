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
}
