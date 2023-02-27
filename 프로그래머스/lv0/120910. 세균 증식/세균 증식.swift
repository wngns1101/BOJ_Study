import Foundation

func solution(_ n:Int, _ t:Int) -> Int {
    var answer = n
    for i in 0...t-1{
        answer = answer * 2
    }
    return answer
}