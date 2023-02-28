import Foundation

func solution(_ array:[Int]) -> Int {
    var index = 0
    for i in array{
        var str = String(i).unicodeScalars.map(String.init)
        for i in str{
            if i == "7"{
                index = index + 1
            }
        }
    }
    return index
}