import Foundation

func solution(_ array:[Int]) -> [Int] {
    var answer : [Int] = []
    answer.append(array.max()!)
    answer.append(array.firstIndex(of: array.max()!)!)
    return answer
}