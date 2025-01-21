class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";
        
//      비디오 길이   
        String[] splitVideoLen = video_len.split(":");
        int videoMinutes = Integer.parseInt(splitVideoLen[0]);
        int videoSeconds = Integer.parseInt(splitVideoLen[1]);
        int totalVideoSeconds = videoMinutes * 60 + videoSeconds;

        
//      시작 시간
        String[] splitPos = pos.split(":");
        int posMinutes = Integer.parseInt(splitPos[0]);
        int posSeconds = Integer.parseInt(splitPos[1]);
        int totalPosSeconds = posMinutes * 60 + posSeconds;
        
//      오프닝 시간   
        String[] splitOpStart = op_start.split(":");
        int opStartMinutes = Integer.parseInt(splitOpStart[0]);
        int opStartSeconds = Integer.parseInt(splitOpStart[1]);
        int totalOpStartSeconds = opStartMinutes * 60 + opStartSeconds;
        
//      오프닝 종료 시간   
        String[] splitOpEnd = op_end.split(":");
        int opEndMinutes = Integer.parseInt(splitOpEnd[0]);
        int opEndSeconds = Integer.parseInt(splitOpEnd[1]);
        int totalOpEndSeconds = opEndMinutes * 60 + opEndSeconds;
        
        for (String command: commands) {
            if (command.equals("next")) {
                
                if (totalPosSeconds <= totalOpEndSeconds && totalPosSeconds >= totalOpStartSeconds) {
                    posMinutes = opEndMinutes;
                    posSeconds = opEndSeconds;
                    totalPosSeconds = posMinutes * 60 + posSeconds;
                }
                
                posSeconds += 10;
                totalPosSeconds = posMinutes * 60 + posSeconds;
                
                if (posSeconds >= 60) {
                    posMinutes += posSeconds / 60;
                    posSeconds = posSeconds % 60;
                }
                
                if (totalPosSeconds <= totalOpEndSeconds && totalPosSeconds >= totalOpStartSeconds) {
                    posMinutes = opEndMinutes;
                    posSeconds = opEndSeconds;
                    totalPosSeconds = posMinutes * 60 + posSeconds;
                }
                
                if (totalPosSeconds > totalVideoSeconds) {
                    posMinutes = videoMinutes;
                    posSeconds = videoSeconds;
                    totalPosSeconds = posMinutes * 60 + posSeconds;
                }
                
            } else {
                if (totalPosSeconds <= totalOpEndSeconds && totalPosSeconds >= totalOpStartSeconds) {
                    posMinutes = opEndMinutes;
                    posSeconds = opEndSeconds;
                }
                
                posSeconds -= 10;
                if (posSeconds < 0) {
                    posMinutes -= 1;
                    posSeconds += 60;
                }
                if (posMinutes < 0) {
                    posMinutes = 0;
                    posSeconds = 0;
                }

                totalPosSeconds = posMinutes * 60 + posSeconds;
                
                if (totalPosSeconds <= totalOpEndSeconds && totalPosSeconds >= totalOpStartSeconds) {
                    posMinutes = opEndMinutes;
                    posSeconds = opEndSeconds;
                    totalPosSeconds = posMinutes * 60 + posSeconds;
                }
                
            }
        }
        
        if (posMinutes < 10) {
            answer += "0" + posMinutes + ":";
        } else {
            answer += posMinutes + ":";
        }
        
        if (posSeconds < 10) {
            answer += "0" + posSeconds;
        } else {
            answer += posSeconds;
        }
        
        return answer;
    }
}