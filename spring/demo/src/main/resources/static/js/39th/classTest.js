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
            GetSetObj.number++
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

        static getStaticNumber () {
            return GetSetObj.number
        }
    }

    GetSetObj.number = 0

    console.log("GetSetObj")

    let gsObj = new GetSetObj()

    console.log(gsObj.getName())
    console.log(gsObj.getMajor())

    console.log(GetSetObj.getStaticNumber())

    gsObj.display()

    let gsObj2 = new GetSetObj()
    console.log(GetSetObj.getStaticNumber())

    class ExtendObj extends GetSetObj {
        constructor () {
            super()
        }
    }

    let extObj = new ExtendObj()

    extObj.setName("상속이 되는구나")
    extObj.display()

    console.log("자바랑 똑같이 상위 클래스 내용 가져다 쓸 수 있음(display)")
}