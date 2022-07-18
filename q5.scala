object q4 extends App {
    def runningTime(distance:Int, pace: Int ): Int = pace*distance;

    def totalRunTime(dis1:Int, pc1:Int,dis2:Int, pc2:Int,dis3:Int, pc3:Int): Int = runningTime(2,8) + runningTime(3,7) + runningTime(2,8);

    println(totalRunTime(2,8,3,7,2,8));
}