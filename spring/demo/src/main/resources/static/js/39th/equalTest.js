function EqualTest () {
    let name = "test"

    if (name) {
        console.log("true")
    } else {
        console.log("false")
    }

    if (name == "test") {
        console.log("equal")
    } else {
        console.log("not equal")
    }

    if (name == "go") {
        console.log("equal")
    } else {
        console.log("not equal")
    }
    
    if (name == null) {
        console.log("equal")
    } else {
        console.log("not equal")
    }
    
    if (name == true) {
        console.log("equal")
    } else {
        console.log("not equal")
    }

    if (name == undefined) {
        console.log("equal")
    } else {
        console.log("not equal")
    }
}