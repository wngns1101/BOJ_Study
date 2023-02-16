import Foundation

func solution(_ sides:[Int]) -> Int {
    var descending = sides.sorted()
    if descending[2] >= descending[0] + descending[1]{
        return 2
    }else{
        return 1
    }
}