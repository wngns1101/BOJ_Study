import Foundation

func solution(_ dots:[[Int]]) -> Int {
    var width: [Int] = []
    var height: [Int] = []
    for i in 0...3{
        width.append(dots[i][0])
        height.append(dots[i][1])
    }

    return abs(width.max()! - width.min()!) * abs(height.max()! - height.min()!)
}