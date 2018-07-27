class time{
	int hour,min;
	time(){ };
	time(int h,int m){
		hour=h;
		min=m;	
}
	void sum(time t1,time t2)
{
	hour=t1.hour+t2.hour;
	min=t1.min+t2.min;
	System.out.println("Hours is" + hour);
	System.out.println("Min is" + min);
}


class extra4{
	public static void main(String arg[]){
		time t1 = new time(10,15);
		time t2 = new time(2,15);
		time t3 = new time();
		t3.sum(t1,t2);
			}
}
