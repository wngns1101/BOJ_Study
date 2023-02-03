import Foundation

func solution(_ slice:Int, _ n:Int) -> Int {
    if slice == n {return 1}
    if n % slice == 0 {
        return n / slice
    }else{
        return n / slice + 1
    }
}