import Foundation

func solution(_ array:[Int]) -> Int {
    var array = array.sorted(by: <)
    var index = array.count / 2
    return array[index]
}