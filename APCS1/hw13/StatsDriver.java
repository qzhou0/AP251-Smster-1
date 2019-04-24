//Qian Zhou
//APCS1 pd<01>
//HW<13> -- May ah Hahv S’maur, Please?
//2017-10-06   



public class StatsDriver{

    public static void main(String[] args){

	System.out.println("========test int mean======= expects 4, -4, 4");
	System.out.println(Stats.mean(4,5));// 4
	System.out.println(Stats.mean(-4,-5));// -4
	System.out.println(Stats.mean(4,4));// 4

	System.out.println(" ============test double mean =========ex[pects 5.946, 5.5");
	System.out.println(Stats.mean(5.1, 6.792));//5.946
	System.out.println(Stats.mean(5, 6.0));//5.5

	System.out.println("===========test int max===========expects 5,1,-1");
	System.out.println(Stats.max(3,5));//5
	System.out.println(Stats.max(-6,1));//1
	System.out.println(Stats.max(-6,-1));//-1

	System.out.println("============test double max========expects 8.0,88.0");
        System.out.println(Stats.max(7.999,8));//8.0
	System.out.println(Stats.max(-88,88.0));//88.0

	System.out.println("============test 3 input int max========expects 8, 88");
        System.out.println(Stats.max(7, 8, -1));//8
	System.out.println(Stats.max(-88,88, 88));//88

	System.out.println("============test 3 input  double max========expects 8.000000001,88.0,8.0");
        System.out.println(Stats.max(7.999,8, 8.000000001));//8.000000001
	System.out.println(Stats.max(-88,88.0,-88));//88.0
	System.out.println(Stats.max(7.0, 8, -1));//8.0
	System.out.println("==============test int geomean===========expects 9,3,4,6");
	System.out.println(Stats.geoMean(3,27));//9
	System.out.println(Stats.geoMean(3,4));//3
	System.out.println(Stats.geoMean(6,4));//4
	System.out.println(Stats.geoMean(2,18));//6


	System.out.println("============test double geomean ===========");
	System.out.println(Stats.geoMean(5.56,3.63));//4.492527128

	System.out.println("==============test 3 input int geomean===========expects 24,3,5,6,109");
	System.out.println(Stats.geoMean(64,8,27));//24
	System.out.println(" the one above actually returns 23, probably due to some binary problems?");
	System.out.println(Stats.geoMean(3,4,5));//3
	System.out.println(Stats.geoMean(6,4,8));//5
	System.out.println(Stats.geoMean(2,18,8));//6
	System.out.println(Stats.geoMean(8,226,729));//109

	System.out.println("==============test 3 input double geomean===========expects 24.0,3.91486...,5.76899...,6.60385...,109.641588");
	System.out.println(Stats.geoMean(64.,8,27));//24.0
	System.out.println(" the one above actually returns 23.99999..., guess would be some binary problems");
	System.out.println(Stats.geoMean(3.,4,5));//3.91486...
	System.out.println(Stats.geoMean(6.,4,8));//5.76899...
	System.out.println(Stats.geoMean(2.,18,8));//6.60385...
	System.out.println(Stats.geoMean(8.,226,729));//109.641588...

    }
}
