function ArrayApiTest () {
    console.log("JavaScript Array test")

    let arr = ["one", "two", "three"]

    console.log(arr)
    console.log(arr.toString())

    // 각 원소와 원소 사이에 join() 에 있는 정보를 붙이는 역할을 함
    console.log(arr.join(", "))

    console.log("pop(요소 빼기) 이전: " + arr)
    let elem = arr.pop()

    // 실제로 pop 방식으로 빼내는 것은
    // 물건을 쌓아 올리고 하나씩 빼는 구조를 생각하면 됨
    console.log("pop(요소 빼기) 이후: " + arr)
    console.log("빼낸 요소: " + elem)

    console.log("push(집어 넣기) 이전: " + arr)
    let len = arr.push("seven")

    console.log("push(집어 넣기) 이후: " + arr)
    console.log("java의 array.length 역할: " + len)

    for (let i = 0; i < 3; i++) {
        console.log("arr[" + i + "] = " + arr[i])
    }

    // 위의 pop 케이스는 나중에 들어온 놈이 먼저 나간다: Stack
    // 먼저 들어온 놈이 먼저 나간다: Queue
    elem = arr.shift()
    console.log("shift() 이후: " + arr)
    console.log("shift 값(elem): " + elem)

    len = arr.unshift("333")
    console.log("unshift() 이후: " + arr)
    console.log("len 값: " + len)

    // 2번째 인덱스에서 0개를 지우고 해당 위치에 정보를 입력
    arr.splice(2, 0, "elem1", "elem2")
    console.log("splice 이후: " + arr)

    // 2번째 인덱스에서 2개를 지우고 해당 위치에 정보 입력
    arr.splice(2, 2, "elem3", "elem4")
    console.log("splice 이후: " + arr)

    arr.splice(1, 2)
    console.log("splice 이후: " + arr)

    let test = ["four", "five", "six"]

    arr = arr.concat(test)
    console.log("concat 이후: " + arr)

    arr = arr.concat("I can add string")
    console.log("concat 이후: " + arr)

    let testArr1 = [1, 3]
    let testArr2 = [3, 7]

    arr = arr.concat(testArr1, testArr2)
    console.log("concat 이후: " + arr)

    arr = [1, 2, 3, 4, 5, 6, 7]
    let slicedArr = arr.slice(1)

    console.log("slice 이후: " + arr)
    console.log("slice의 결과: " + slicedArr)

    arr = [1, 2, 3, 4, 5, 6, 7]
    slicedArr = arr.slice(3)

    console.log("slice 이후: " + arr)
    console.log("slice의 결과: " + slicedArr)
}