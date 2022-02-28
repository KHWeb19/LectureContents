let app = new Vue({
    el: '#app',
    data: {
        monsterBook: [
            { monsterId: 1, name: '슬라임', hp: 50, exp: 10, dropMoney: 5 },
            { monsterId: 2, name: '고블린', hp: 80, exp: 15, dropMoney: 10 },
            { monsterId: 3, name: '사슴', hp: 100, exp: 25, dropMoney: 10 },
            { monsterId: 4, name: '리본돼지', hp: 100, exp: 15, dropMoney: 25 },
            { monsterId: 5, name: '오크', hp: 150, exp: 15, dropMoney: 25 },
            { monsterId: 6, name: '멧돼지', hp: 150, exp: 15, dropMoney: 25 },
            { monsterId: 7, name: '스켈레톤', hp: 150, exp: 15, dropMoney: 25 },
            { monsterId: 8, name: '고블린매지션', hp: 150, exp: 15, dropMoney: 25 },
            { monsterId: 9, name: '소', hp: 150, exp: 15, dropMoney: 25 },
            { monsterId: 10, name: '뱀', hp: 150, exp: 15, dropMoney: 25 },
            { monsterId: 11, name: '곰', hp: 150, exp: 15, dropMoney: 25 },
            { monsterId: 12, name: '토끼', hp: 150, exp: 15, dropMoney: 25 },
            { monsterId: 13, name: '호랑이', hp: 150, exp: 15, dropMoney: 25 },
            { monsterId: 14, name: '스켈레톤 아처', hp: 150, exp: 15, dropMoney: 25 },
            { monsterId: 15, name: '리치', hp: 150, exp: 15, dropMoney: 25 },
            { monsterId: 16, name: '죽음의 군주', hp: 150, exp: 15, dropMoney: 25 },
            { monsterId: 17, name: '골렘', hp: 150, exp: 15, dropMoney: 25 },
            { monsterId: 18, name: '와이번', hp: 150, exp: 15, dropMoney: 25 },
            { monsterId: 19, name: '드레이크', hp: 150, exp: 15, dropMoney: 25 },
            { monsterId: 20, name: '구울', hp: 150, exp: 15, dropMoney: 25 },
            { monsterId: 21, name: '오우거', hp: 150, exp: 15, dropMoney: 25 },

            { monsterId: 999, name: '드래곤', hp: 150, exp: 15, dropMoney: 25 },
            { monsterId: 1000, name: '옐로 드래곤', hp: 150, exp: 15, dropMoney: 25 },
            { monsterId: 1001, name: '그린 드래곤', hp: 150, exp: 15, dropMoney: 25 },
            { monsterId: 1002, name: '레드 드래곤', hp: 150, exp: 15, dropMoney: 25 },
            { monsterId: 1003, name: '블루 드래곤', hp: 150, exp: 15, dropMoney: 25 },
            { monsterId: 1004, name: '블랙 드래곤', hp: 150, exp: 15, dropMoney: 25 },
            { monsterId: 1005, name: '골드 드래곤', hp: 150, exp: 15, dropMoney: 25 },
            { monsterId: 1005, name: '데스 드래곤', hp: 150, exp: 15, dropMoney: 25 },
            { monsterId: 1007, name: '스텔스 드래곤', hp: 150, exp: 15, dropMoney: 25 },
        ],
        list: [
            { id: 1, monsterId: 1, name: '슬라임', hp: 50 },
            { id: 2, monsterId: 2, name: '고블린', hp: 80 },
            { id: 3, monsterId: 3, name: '사슴', hp: 100 },
            { id: 4, monsterId: 4, name: '리본돼지', hp: 100},
            { id: 5, monsterId: 1, name: '슬라임', hp: 50 },
        ],
        name: '알아서 생성됨',
        randomNumber: 0
    },
    methods: {
        generateRandom: function () {
            this.randomNumber = Math.floor(Math.random() * 10) + 1;
        },
        addMonster: function () {
            let max = this.list.reduce(function(a, b) {
                return a > b.id ? a : b.id
            }, 0)

            let randNum = Math.floor(Math.random() * this.monsterBook.length) + 1

            this.list.push({
                id: max + 1,
                monsterId: randNum,
                name: this.monsterBook[randNum].name,
                hp: this.monsterBook[randNum].hp
            })
        },
        removeMonster: function (index) {
            this.list.splice(index, 1)
        },
        attackMonster: function (index) {
            this.list[index].hp -= 10
        }
    },
    beforeUpdate () {
        console.log('VDOM의 변화를 감지하는 루틴')

        let i
        for (i = 0; i < this.list.length; i++) {
            if (this.list[i].hp <= 0) {
                this.list.splice(i, 1)
            }
        }
    }
})