import Foundation

func solution(_ keyinput:[String], _ board:[Int]) -> [Int] {
    var answer:[Int] = [0, 0]
    for i in keyinput{
        if i == "left"{
            if answer[0] == -board[0]/2{
                continue
            }else{
                answer[0] = answer[0] - 1
            }
        }
        if i == "right"{
            if answer[0] == board[0]/2{
                continue
            }else{
                answer[0] = answer[0] + 1
            }
        }
        if i == "up"{
            if answer[1] == board[1]/2{
                continue
            }else{
                answer[1] = answer[1] + 1
            }
        }
        if i == "down"{
            if answer[1] == -board[1]/2{
                continue
            }else{
                answer[1] = answer[1] - 1
            }
        }
    }
    
    return answer
}