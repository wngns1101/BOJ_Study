import Foundation

func solution(_ strlist:[String]) -> [Int] {
    var answer : [Int] = []
    for i in strlist{
        var count = 0
        for j in i{
            count += 1
        }
        answer.append(count)
    }
    return answer
}