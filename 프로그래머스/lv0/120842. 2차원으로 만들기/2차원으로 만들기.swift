import Foundation

func solution(_ num_list:[Int], _ n:Int) -> [[Int]] {
    var index = 0
    var answer : [[Int]] = []
    var array : [Int] = []
    for i in num_list{
        if index < n{
            array.append(i)
            index += 1
        }else{
            index = 1
            answer.append(array)
            array.removeAll()
            array.append(i)
        }
    }
    answer.append(array)
    return answer
}