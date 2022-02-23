function JsSetTest () {
    console.log("JavaScript Set Test")

    let set = new Set()

    console.log("set: " + set)

    let set2 = new Set(["Banana", "Watermelon"])

    console.log("set2.size: " + set2.size)

    set2.add("Cherry")
    set2.add("Grape")

    console.log(set2.has("Grape"))
    console.log(set2.has("Strawberry"))

    set2.clear()
    console.log(set2.has("Grape"))
}
