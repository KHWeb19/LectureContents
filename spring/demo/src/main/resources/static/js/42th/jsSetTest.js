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

    //set2.clear()
    //console.log(set2.has("Grape"))

    let setKeyIter = set2.keys()

    for (let key of setKeyIter) {
        console.log("key: " + key)
    }

    let setEntryIter = set2.entries()

    for (let entry of setEntryIter) {
        console.log("entry: " + entry)
    }

    set2.forEach(function(val1, val2) {
        console.log(val1 + " : " + val2)
    })
}
