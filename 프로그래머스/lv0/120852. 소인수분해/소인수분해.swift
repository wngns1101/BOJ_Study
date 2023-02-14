import Foundation

func solution(_ n:Int) -> [Int] {
    var num = n
    var answer: [Int] = []
    for i in 2...num{
        while num % i == 0{
            if !answer.contains(i){
                answer.append(i)
            }
            num = num / i
        }
    }
    return answer
}