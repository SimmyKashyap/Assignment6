class StringToInt{
	public static void main(String[] args){
		int one=Integer.parseInt(args[0]);
		int two=Integer.parseInt(args[1]);
		if(one>two){
			System.out.println(one+" is greater");
		}
		else{
			System.out.println(two+" is greater");
		}
	}
}