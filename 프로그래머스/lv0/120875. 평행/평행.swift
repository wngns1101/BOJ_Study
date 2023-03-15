import Foundation

func resultCalculator(_ dot1: Int, _ dot2: Int, _ dot3: Int, _ dot4: Int, _ arr: [[Int]]) -> Int {
    var line1x = arr[dot1][0] - arr[dot2][0]
    var line1y = arr[dot1][1] - arr[dot2][1]
    var line2x = arr[dot3][0] - arr[dot4][0]
    var line2y = arr[dot3][1] - arr[dot4][1]
    if Double(line1y) / Double(line1x) == Double(line2y) / Double(line2x) {
        return 1
    }
    return 0
}

func solution(_ dots:[[Int]]) -> Int {
    guard resultCalculator(0, 1, 2, 3, dots) == 0 else { return 1 }
    guard resultCalculator(0, 2, 1, 3, dots) == 0 else { return 1 }
    guard resultCalculator(0, 3, 1, 2, dots) == 0 else { return 1 }
    
    return 0
}