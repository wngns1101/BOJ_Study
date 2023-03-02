import Foundation

func solution(_ array:[Int], _ n:Int) -> Int {
    var index = 0
    for i in array{
        if i == n{
            index = index + 1
        }
    }
    return index
}