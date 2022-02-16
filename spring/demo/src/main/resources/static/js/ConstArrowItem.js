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

    for (let i = 0; i < 2; i++) {
        console.log("name: " + itemArr[i].name + ", price: " + 
                itemArr[i].price + ", quantity: " + itemArr[i].quantity)
    }
}