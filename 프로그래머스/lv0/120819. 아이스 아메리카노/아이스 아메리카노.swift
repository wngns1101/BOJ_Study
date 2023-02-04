import Foundation

func solution(_ money:Int) -> [Int] {
    if money < 5500{
        return [0, money]
    }
    var cup = 0
    var leftMoney = 0
    cup = money / 5500
    leftMoney = money % 5500
    return[cup, leftMoney]
}