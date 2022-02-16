// ConstArrowItem = () => { 는 아래와 동의어다.
// ConstArrowItem () {
// 어떻게 보면 불편할지도 모르는데 화살표 형식으로 함수등을 할당할 때 많이 사용한다.
const ConstArrowItem = () => {
    const itemArr = [
        {
            name: "Ryzen 5",
            price: 600000,
            quantity: 1,
        },
        {
            name: "DDR6 RAM",
            price: 640000,
            quantity: 2,
        },
    ]

    /*
    화살표 함수는 함수를 선언할 때 this 자체에 맵핑될 객체가 정적으로 결정됨
    화살표 함수의 this는 언제나 정적으로 불변임을 의미함
    내부에서 변수값을 바꾸더라도 화살표를 쓰면 신경 안쓴다는 것을 의미하며
    화살표가 아닌 애들은 내부값의 변경에 영향을 받음을 의미함
    */

    for (let i = 0; i < 2; i++) {
        console.log("name: " + itemArr[i].name + ", price: " + 
                itemArr[i].price + ", quantity: " + itemArr[i].quantity)
    }
}