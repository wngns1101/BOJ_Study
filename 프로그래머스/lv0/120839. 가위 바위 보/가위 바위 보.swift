import Foundation

func solution(_ rsp:String) -> String {
    var answer = ""
    for i in rsp{
        if i == "0"{
            answer += "5"
        }else if i == "2"{
            answer += "0"
        }else{
            answer += "2"
        }
    }
    return answer
}