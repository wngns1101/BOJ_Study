import Foundation

func solution(_ order:Int) -> Int {
    var answer = 0
    for i in String(order){
        if Int(String(i))! % 3 == 0 && Int(String(i))!     != 0{
            answer += 1
        }
    }
    return answer
}