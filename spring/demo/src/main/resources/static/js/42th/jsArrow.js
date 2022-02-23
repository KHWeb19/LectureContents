function ArrowAPITest () {
    console.log("JavaScript Arrow Function Test")

    const f = function () { return "33" }

    const arrowFunc = () => { return "77" }

    console.log("f: " + f())
    console.log("arrowFunc: " + arrowFunc())
}