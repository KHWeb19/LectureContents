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

    class GetSetObj {
        constructor () {
            this.name = "test"
            this.major = "electronics"
        }

        getName () {
            return this.name
        }
        getMajor () {
            return this.major
        }
        setName (name) {
            this.name = name
        }
        setMajor (major) {
            this.major = major
        }
        display () {
            console.log(this.name)
            console.log(this.major)
        }
    }

    console.log("GetSetObj")

    let gsObj = new GetSetObj()

    console.log(gsObj.getName())
    console.log(gsObj.getMajor())

    gsObj.display()
}