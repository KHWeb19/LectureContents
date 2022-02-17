function ClassTest () {
    class Obj {
        constructor () {
            this.name = "test"
            this.major = "electronics"
        }
    }

    let obj = new Obj()

    console.log(obj.name)
    console.log(obj.major)
}