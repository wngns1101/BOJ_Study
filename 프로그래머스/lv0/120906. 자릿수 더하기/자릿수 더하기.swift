import Foundation

func solution(_ n:Int) -> Int {
    var answer = 0
    for i in String(n){
        answer += Int(String(i))!
    }
    return answer
}