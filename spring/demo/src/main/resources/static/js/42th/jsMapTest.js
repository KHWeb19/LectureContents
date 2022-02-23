function JsMapTest () {
    console.log("JavaScript Map Test")

    let map = new Map()

    console.log("map: " + map)

    let map2 = new Map([["Apple", "green"], ["Banana", "yellow"]])

    console.log("map2: " + map2)
    console.log("map2 size: " + map2.size)

    console.log("map2.get('test1'): " + map2.get("test1"))
    console.log("map2.get('Banana'): " + map2.get("Banana"))
    console.log("map2.has('test2'): " + map2.has("test2"))
    console.log("map2.has('Apple'): " + map2.has("Apple"))
}
