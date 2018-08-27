

public class ComplexNumbers {

	public static double [] complexAdd(double[] z1, double[] z2){
		double[] z3 = new double [2];
		z3[0] = z1[0]+z2[0];
		z3[1] = z1[1]+z2[1];
		return z3;
	}
	
	/*public static double [] complexConjugate(double[] z){
		double[] z1 = new double [2];
		z1[0]=z[0];
		z1[1]= -1*z[1];
		return z1;
	}
	
	public static double [] complexMultiply(double[] z1, double[] z2){
		double[] z3 = new double [2];
		z3[0] = z1[0]*z2[0];
		z3[1] = z1[1]*z2[1];
		return z3;
	}
	
	public static double [] complexReciprocal(double[] z1){	//?
		double[] z11 = new double [2];//z1有啥用
		/*double[] z2 = new double [2];
		z2[0] = z[0]/(z[0]*z[0]+z[1]*z[1]);
		z2[1] = (-1*z[1])/(z[0]*z[0]+z[1]*z[1]);
		//z2=(1/z1);
		//return z1;
		return z11;
	}
	
	public String toString(double[] z){

		if(z[0]==0.0){
			return 	Math.round(z[1])+"i";
		}else if(z[1]==0.0){
			return Math.round(z[0])+"";
		}else if(z[0]==0.0&&z[1]==0.0){
			return 0.0+"";
		}else{
			return Math.round(z[0])+Math.round(z[1])+"i";
		}
	}

	
	public double[] [] sortByMagnitude(double[] [] complexList){
/*		double[][] list = new double[1][2];
		int len = complexList.length;
		int magnitude = Math.sqrt(z[0]*z[0]+z[1]*z[1]);
		for(int i=0;i<len;i++){
			
		}
		return list;

		return null;
	}
*/	
	public static void main(String[] args){
		//main写法错误 不是string args[]
		//double[] z1 = {Double.parseDouble(args[0]),Double.parseDouble(args[1])};
		//double[] z2 = {Double.parseDouble(args[2]),Double.parseDouble(args[3])};
		double[] z1={0,1};
		System.out.println(z1[0]);
		double[] z2={0,1};
		System.out.println("("+complexAdd(z1,z2)+")");
		/*System.out.println("("+complexConjugate(z1)+")");
		System.out.println("("+complexMultiply(z1,z2)+")");
		System.out.println("("+complexReciprocal(z1)+")");
		System.out.println("("+complexConjugate(z1)+")");//输入错误*/
	}
}
