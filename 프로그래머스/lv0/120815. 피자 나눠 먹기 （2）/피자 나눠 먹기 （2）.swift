import Foundation

func gcb(_ n: Int, _ m: Int) -> Int{
    if m == 0 {
        return n
    } else{
        return gcb(m, n % m)
    }
}

func solution(_ n:Int) -> Int {
    if n == 6 { return 1}
    var result = n * 6 / gcb(n, 6)
    return result / 6
}